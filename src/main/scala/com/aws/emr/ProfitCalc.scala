package com.aws.emr

import org.apache.spark.SparkConf
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.types._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._



object ProfitCalc {

  def main(args: Array[String]) {

    val spark = SparkSession
      .builder()
      .appName("ProfitCalculator")
      .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
      .enableHiveSupport()
      .getOrCreate()

    val input = args(0)
    val output = args(1)

    val dataDF = spark.read
      .option("mode", "DROPMALFORMED")
      .option("header", "true")
      .csv(input)

    val aggDF = dataDF.groupBy("date").agg(sum("Profit").cast("long").alias("total_profit"))

    aggDF.coalesce(1).write.format("csv").option("mode", "Overwrite").save(output)

  }
} 

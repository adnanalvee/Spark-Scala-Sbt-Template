package ame

import org.apache.spark.SparkConf
import org.apache.spark.{ SparkConf, SparkContext }
import org.apache.spark.sql.types._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.expressions.Window
import org.apache.spark.storage.StorageLevel._

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs._
import org.apache.hadoop.io._

import java.io._


object MyObject {

  def main(args: Array[String]) {

    val spark = SparkSession
     .builder()
     .appName("MySparkApp")
     .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
     .enableHiveSupport()
     .getOrCreate()

    val sc = spark.sparkContext

    val hiveContext = new org.apache.spark.sql.hive.HiveContext(sc)
    import hiveContext.implicits._


    // Your code goes here

    
  }
} 

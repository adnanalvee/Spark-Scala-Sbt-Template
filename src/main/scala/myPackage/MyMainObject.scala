package myPackage

// lets import some important imports :P
import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.sql.functions.broadcast
import org.apache.spark.sql.types._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object MyMainObject {

  // Always declare your Class files outside main method.
  case class OnePerson(col1: String, col2:String, cole:String)

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("AdnansSparkApp")

    // Lets Create a Scala Spark Context.
    val sc = new SparkContext(conf)

    val sqlContext = new org.apache.spark.sql.SQLContext(sc)

    // This import must be imported after the above statement (Always Remember)
    import sqlContext.implicits._

    // Lets drop some code here
    val data = sc. textFile("/wherever/whatever")

    // Make sure to convert your Dataframe to rdd to use the method 'saveAsTextFile'
    rddJoined.saveAsTextFile("/wherever/whatever")

  }
}

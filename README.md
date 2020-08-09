# Spark-Scala Sbt Template
This is a sample Spark job written in Scala running computation on dummy sales data. The sales data is provided as a CSV file. Check how to run locally below to trigger a test run.

### Requirements:
scala, sbt

### Configuration  
default settings in build.sbt file, change according to your project.  <br />
  `name := "Sample_Spark_Submit_Project",`  <br />
  `version := "1.0",` <br />
  `scalaVersion := "2.11.0",` <br />
  `assemblyJarName in assembly := "Adnan.jar",` <br />
  `mainClass in Compile := Some("com.adnan.MyObject")` <br />


### How to compile:
1. `git clone https://github.com/adnanalvee/Spark-Scala-Sbt-Template.git`  
2. Open with any text editor or IDE of your choice and start writing code.    
3. Once done, open a terminal and type `sbt assembly` .  
4. Your required JAR will be now in the target folder of the repo.  

### How to run as is locally (using homebrew for MacOS):
1. Install homebrew in mac
2. Run 'brew install apache-spark' (This will install apache spark locally in your desktop)
3. Go to the code directory > target/scala-2.12
4. Run the following command from the directory changing the location parameters as per your environment. 
   `spark-submit` <br />
`--master local`  <br />
`--driver-memory 2g` <br />
`--executor-memory  2g` <br />
`--class com.aws.emr.ProfitCalc` <br />
`/Users/yourprofile/prefix/spark-scala-sbt-template-master/target/scala-2.12/SparkProfitCalc.jar` <br />
`/Users/yourprofile/prefix/spark_launcher/bin/spark_code/spark-scala-sbt-template-master/target/scala-2.12/sales_data.csv` <br />
`/Users/yourprofile/prefix/spark_launcher/bin/spark_code/spark-scala-sbt-template-master/target/scala-2.12/output`  <br />
5. Once the code runs successfully, you find the output in the output directory under target/scala-2.12.
   

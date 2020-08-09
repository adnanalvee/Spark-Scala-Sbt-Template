lazy val root = (project in file(".")).
  settings(
  name := "LambdaEMRSparkBatchJob",
  version := "1.0",
  scalaVersion := "2.12.0",
  assemblyJarName in assembly := "SparkProfitCalc.jar",
  mainClass in Compile := Some("com.aws.emr")
  )

val sparkVersion = "2.4.0"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-hive" % sparkVersion % "provided"
  )



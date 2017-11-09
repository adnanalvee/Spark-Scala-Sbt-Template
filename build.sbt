lazy val root = (project in file(".")).
  settings(
  name := "Sample_Spark_Submit_Project",
  version := "1.0",
  scalaVersion := "2.11.0",
  assemblyJarName in assembly := "Adnan.jar",
  mainClass in Compile := Some("com.adnan.MyObject")
  )

val sparkVersion = "2.1.1"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-hive" % sparkVersion % "provided"
  )

  // META-INF discarding
  mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
     {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case x => MergeStrategy.first
     }
  }

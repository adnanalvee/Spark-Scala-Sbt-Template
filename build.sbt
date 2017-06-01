lazy val root = (project in file(".")).
  settings(
    name := "SparkScala-Sbt-Template",
    version := "1.0",
    scalaVersion := "2.10.4",
    mainClass in Compile := Some("myPackage.MyMainObject")
  )

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.2" % "provided",
   "org.apache.spark" %% "spark-mllib" % "1.6.2" % "provided",
    "org.apache.spark" %% "spark-hive" % "1.6.2" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.6.2" % "provided"
)

// META-INF discarding
mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
   {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
   }
   }

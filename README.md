# Spark-Scala Sbt Template

### Requirements:
scala, sbt

### Things to change

default settings in build.sbt file, change according to your project.  <br />
  `name := "Sample_Spark_Submit_Project",`  <br />
  `version := "1.0",` <br />
  `scalaVersion := "2.11.0",` <br />
  `assemblyJarName in assembly := "Adnan.jar",`
  `mainClass in Compile := Some("com.adnan.MyObject")`


### How to use:

`git clone https://github.com/adnanalvee/Spark-Scala-Sbt-Template.git`  
  
Open with any text editor or IDE of your choice and start writing code.  
  
Once done, open a terminal and type  
`sbt assembly`  

Your required JAR will be now in the target folder of the repo.

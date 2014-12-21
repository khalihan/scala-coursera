name := "pattern-match-huffman"

version := "1.0.0"

scalaVersion := "2.11.4"

scalacOptions ++= Seq("-deprecation", "-feature")


// This setting defines the project to which a solution is submitted. When creating a
// handout, the 'createHandout' task will make sure that its value is correct.

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.json4s" %% "json4s-jackson" % "3.2.11",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "org.specs2" %% "specs2" % "2.4.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.6" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "org.hamcrest" % "hamcrest-core" % "1.3" % "test",
  "org.mockito" % "mockito-core" % "1.10.8" % "test",
  "org.testng" % "testng" % "6.8.8" % "test"
)

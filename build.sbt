import sbt.Keys._



name := "scala-coursera"

version := "1.0"

scalaVersion := "2.11.4"

resolvers += Classpaths.sbtPluginReleases

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Typesafe snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

scalacOptions += "-feature"

scalacOptions += "-deprecation"



lazy val recfun = ProjectRef(file("workspace/recfun"), "recfun")

lazy val funsets = ProjectRef(file("workspace/funsets"), "funsets")

lazy val objsets = ProjectRef(file("workspace/object-oriented-sets"), "object-oriented-sets")

lazy val patmat = ProjectRef(file("workspace/pattern-match-huffman"), "pattern-match-huffman")

lazy val forcomp = ProjectRef(file("workspace/forcomp-anagrams"), "forcomp-anagrams")

lazy val streamz = ProjectRef(file("workspace/lazy-evaluation-streams-bloxorz"), "lazy-evaluation-streams-bloxorz")

lazy val root = (project in file(".")).aggregate(recfun, funsets, objsets, patmat, forcomp, streamz)




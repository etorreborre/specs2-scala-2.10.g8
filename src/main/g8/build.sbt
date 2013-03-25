name := "specs2-project"

organization := "org.specs2"

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.15-SNAPSHOT",
  "org.scala-lang" % "scala-reflect" % "2.10.1",  
  "org.mockito" % "mockito-all" % "1.9.0",
  "org.scalacheck" %% "scalacheck" % "1.10.0",
  "org.scala-tools.testing" % "test-interface" % "0.5",
  "org.hamcrest" % "hamcrest-all" % "1.1",
  "junit" % "junit" % "4.7",
  "org.pegdown" % "pegdown" % "1.0.2",
  "org.specs2" % "classycle" % "1.4.1")


initialCommands := "import org.specs2._"
name := """play-java-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice

libraryDependencies ++= Seq(
  "org.testng" % "testng" % "6.8.8",
  "de.johoop" % "sbt-testng-interface_2.10" % "3.0.0",
  //"org.scalatest" % "scalatest_2.10" % "2.2.1",
  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.1" % Test
 // "org.scalatestplus" % "play_2.10" % "1.4.0-M4"
)



// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.194"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

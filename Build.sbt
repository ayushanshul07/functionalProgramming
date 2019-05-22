version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.8"

organization := "ayushanshul07"

triggeredMessage := Watched.clearWhenTriggered

initialCommands in console := "import my.collections._"

addCommandAlias("testc", ";clean;coverage;test;coverageReport")

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.5" % "test" )// http://www.scalatest.org

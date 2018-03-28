organization := "ai.x"
version := "1.2.0.1-SNAPSHOT"
description := "diff tool for Scala data structures (nested case classes etc)"
scalaVersion := "2.12.4"
crossScalaVersions := Seq("2.12.4", "2.11.8")

libraryDependencies ++= Seq(
      "com.chuusai" %% "shapeless" % "2.3.3",
      "org.cvogt" %% "scala-extensions" % "0.5.3"
)
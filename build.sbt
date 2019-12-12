enablePlugins(ScalaJSPlugin)

name := "Github contributors"
organization := "org.awesome"
version := "1.0"
scalaVersion := "2.13.1"
isSnapshot := true

scalaJSUseMainModuleInitializer := true
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.7",
  "com.lihaoyi" %%% "upickle" % "0.8.0"
)

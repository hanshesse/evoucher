name := "evoucher-api"

version := "1.0"

scalaVersion := "2.11.5"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  val slickV = "3.0.0"
  val mysqlV = "5.1.35"
  val liftV = "2.6"
  val logbackV = "1.1.3"
  val slf4jV = "1.7.5"
  Seq(
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-http" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-slf4j" % akkaV,
    "com.typesafe.slick" %% "slick" % slickV,
    "mysql" % "mysql-connector-java" % mysqlV,
    "net.liftweb" %% "lift-json" % liftV,
    "org.slf4j" % "slf4j-api" % slf4jV,
    "org.slf4j" % "slf4j-simple" % slf4jV
  )
}
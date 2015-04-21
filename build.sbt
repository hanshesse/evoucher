name := "evoucher-api"

version := "1.0"

scalaVersion := "2.11.5"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  val slickV = "2.1.0"
  val liftV = "2.6"
  val logbackV = "1.1.3"
  val mysqlV = "5.1.35"
  Seq(
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-http" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-slf4j" % akkaV,
    "com.typesafe.slick" %% "slick" % slickV,
    "net.liftweb" %% "lift-json" % liftV,
    "mysql" % "mysql-connector-java" % mysqlV
  )
}
name := "sbt-aws-plugin"
version := "1.0.4"
organization := "com.ovoenergy"
organizationName := "OVO Energy"
scalaVersion := "2.10.4"
sbtPlugin := true

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.3")

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-elasticbeanstalk" % "1.10.43",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.10.43")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
publishMavenStyle := true
publishTo := {
  if (isSnapshot.value)
    Some("Ovotech Nexus Repo Snapshots" at "http://nexus.ovotech.org.uk:8081/nexus/content/repositories/snapshots/")
  else
    Some("Ovotech Nexus Repo Releases" at "http://nexus.ovotech.org.uk:8081/nexus/content/repositories/releases/")
}
pomIncludeRepository := { _ => false }
licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("http://www.ovoenergy.com"))
pomExtra :=
  <developers>
    <developer>
      <id>Ovo Energy</id>
      <name>Ovo Energy</name>
      <url>http://www.ovoenergy.com</url>
    </developer>
  </developers>
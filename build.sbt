import Dependencies._

inThisBuild(List(
    // These are normal sbt settings to configure for release, skip if already defined
    licenses := Seq("MIT" -> url("http://opensource.org/licenses/mit")),
    homepage := Some(url("https://github.com/hejfelix/slinky-wrappers")),
    developers := List(Developer("hejfelix", "Felix Bjært Hargreaves", "hargreaves@lambdaminute.com", url("https://github.com/hejfelix"))),
    scmInfo := Some(ScmInfo(url("https://github.com/hejfelix/slinky-wrappers"), "scm:git:git@github.com:hejfelix/slinky-wrappers.git")),

    // These are the sbt-release-early settings to configure
    pgpPublicRing := file("./travis/local.pubring.asc"),
    pgpSecretRing := file("./travis/local.secring.asc"),
    releaseEarlyWith := SonatypePublisher
))

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.lambdaminute",
      scalaVersion := "2.12.4"
    )),
    name := "wrappers",
    libraryDependencies += scalaTest % Test
  )

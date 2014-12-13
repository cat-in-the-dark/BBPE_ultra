import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

//TODO: refactor build script. SEE here: https://github.com/jmhofer/activator-libgdx-rxscala/tree/master/project

version := "1.0"

val projectName = "BBPE"

name := projectName

scalaVersion := "2.11.4"

libraryDependencies in ThisBuild ++= Seq(
  "com.badlogicgames.gdx" % "gdx" % LibgdxBuild.libgdxVersion,
  "com.badlogicgames.ashley" % "ashley" % LibgdxBuild.ashleyVersion
)

lazy val core = Project("core", file("core")) settings(name := projectName + "-core")

lazy val desktop = Project("desktop", file("desktop")) settings(name := projectName + "-desktop") dependsOn core


mappings in (desktop, Compile, packageBin) ~= { _.filter(_._1.getName.endsWith(".class")) }

mappings in Universal in desktop ++= {
  val a = (baseDirectory.value / "assets").*** pair relativeTo(baseDirectory.value)
  a map (t => (t._1, t._2.replaceFirst("assets", "bin")))
}
import com.typesafe.sbt.SbtNativePackager._

import NativePackagerKeys._

fork in run := true

unmanagedResourceDirectories in Compile += file("assets")

libraryDependencies ++= Seq(
  "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % LibgdxBuild.libgdxVersion,
  "com.badlogicgames.gdx" % "gdx-platform" % LibgdxBuild.libgdxVersion classifier "natives-desktop"
)

packageArchetype.java_application
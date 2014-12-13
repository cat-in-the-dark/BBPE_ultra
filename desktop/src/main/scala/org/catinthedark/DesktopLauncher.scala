package org.catinthedark

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

/**
 * Created by Ilya on 13.12.2014.
 */
object DesktopLauncher extends App {
  override def main(args: Array[String]): Unit = {
    val cfg = new LwjglApplicationConfiguration
    new LwjglApplication(new BBPE(), cfg)
  }
}

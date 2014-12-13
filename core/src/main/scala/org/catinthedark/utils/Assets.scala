package org.catinthedark.utils

import com.badlogic.gdx.maps.tiled.{TmxMapLoader, TiledMap}

/**
 * Created by Ilya on 13.12.2014.
 */
object Assets {
  lazy val map: TiledMap = new TmxMapLoader().load("map/area01.tmx")
}

package org.catinthedark.screens

import com.badlogic.ashley.core.{Family, Engine}
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer
import org.catinthedark.systems.HeroSystem
import org.catinthedark.utils.{Assets, World}

/**
 * Created by Ilya on 13.12.2014.
 */
class GameScreen extends ScreenAdapter {
  val mainLayer = Array(0,1,2)
  val renderer = new OrthogonalTiledMapRenderer(Assets.map, 1 / World.TILE_SIZE)
  var camera = new OrthographicCamera()
  camera.setToOrtho(false, World.WIDTH, World.HEIGHT)

  val engine = new Engine()
  engine.addSystem(new HeroSystem())

  def update(delta: Float) = {
    renderer.render(mainLayer)
    renderer.setView(camera)
    camera.update()
  }

  def drawUI() = {

  }

  override def render(delta: Float) = {
    update(delta)
    drawUI()
  }
}

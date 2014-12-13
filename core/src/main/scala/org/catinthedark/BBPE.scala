package org.catinthedark

import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.{Gdx, Game}
import org.catinthedark.screens.GameScreen

/**
 * Created by Ilya on 13.12.2014.
 */
class BBPE extends Game {
  override def create() = {
    setScreen(new GameScreen())
  }

  override def render() = {
    Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

    super.render()
  }
}

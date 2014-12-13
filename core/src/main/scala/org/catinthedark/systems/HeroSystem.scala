package org.catinthedark.systems

import com.badlogic.ashley.core.{Entity, Family}
import com.badlogic.ashley.systems.IteratingSystem
import org.catinthedark.components.HeroComponent

/**
 * Created by Ilya on 13.12.2014.
 */

class HeroSystem private(val family: Family) extends IteratingSystem(family) {
  def this() = this(Family.getFor(classOf[HeroComponent]))

  override def processEntity(entity: Entity, v: Float): Unit = {

  }
}

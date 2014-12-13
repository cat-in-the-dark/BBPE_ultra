package org.catinthedark.components

import com.badlogic.ashley.core.Component

/**
 * Created by Ilya on 13.12.2014.
 */
object HeroComponent {
  val HEIGHT = 1.5f
  val WIDTH = 1.5f
  object State extends Enumeration {
    type State = Value
    val RUN_LEFT, RUN_RIGHT, RUN_UP, RUN_DOWN,
        IDLE_LEFT, IDLE_RIGHT, IDLE_UP, IDLE_DOWN,
        SHUT_LEFT, SHIT_RIGHT, SHUT_UP, SHUT_DOWN = Value
  }
}

class HeroComponent extends Component {

}

package com.lambdaminute.slinkywrappers.web.material

import com.lambdaminute.slinkywrappers.materialui._
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.{div, h1}

import scala.scalajs.js.{JSON, UndefOr, timers}
import scalajs.js.Dynamic.literal
import concurrent.duration._

@react class DrawerDemo extends Component {
  type Props = Unit
  case class State(open: Boolean = false)
  override def initialState = State()


  private val onClick: EventHandler = (_,_) => {
    scalajs.js.timers.setTimeout(4000){
      this.setState(_.copy(open=false))
    }
    this.setState(s => s.copy(open = !s.open))
  }

  val left: UndefOr[Anchor]  = Anchor.left
  def render():ReactElement = {
    val duration = TransitionDuration(enter=2.seconds, exit=5.seconds)
    div(
      h1("Drawer Demo"),
      Button(color = color.primary,onClick = onClick)("show/hide"),
      Drawer(anchor = left, open = state.open, transitionDuration = duration)(
        Button(color = color.primary)("HERRO")
      )
    )
  }

}

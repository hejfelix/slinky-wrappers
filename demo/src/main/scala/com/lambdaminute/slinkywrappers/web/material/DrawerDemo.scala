package com.lambdaminute.slinkywrappers.web.material

import com.lambdaminute.slinkywrappers.materialui.{Anchor, Button, Drawer}
import com.lambdaminute.slinkywrappers.materialui.color
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.{div, h1}

import scala.scalajs.js.timers
import scala.scalajs.js.UndefOr

@react class DrawerDemo extends Component {
  type Props = Unit
  case class State(open: Boolean = false)
  override def initialState = State()

  override def componentDidMount(): Unit = {
    super.componentDidMount()
    timers.setTimeout(4000){
      setState(_.copy(open = true))
    }
  }


  val left: UndefOr[Anchor]  = Anchor.left
  def render():ReactElement = div(
    h1("Drawer Demo"),
    Drawer(anchor = left, open = state.open)(
      Button(color = color.primary)("HERRO")
    )
  )

}

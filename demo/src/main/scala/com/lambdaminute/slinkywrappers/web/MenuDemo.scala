package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.macros.Macros.sourceAsString
import com.lambdaminute.slinkywrappers.semanticui.menu.{Menu, MenuItem, MenuMenu}
import com.lambdaminute.slinkywrappers.semanticui.{EventHandler, VerticalPosition}
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.div

@react class MenuDemo extends Component {

  case class State(selected: String = "A")

  case class Props()

  override def initialState = State()

  private val menuNames    = List("Menu Item A", "Menu Item B", "Menu Item C")
  private val subMenuNames = menuNames.map(n => s"Sub-$n")

  private val onClick: EventHandler = (_, props) => {
    val clickedName = props.name.asInstanceOf[String]
    println(s"$clickedName, $state")
    this.setState(_.copy(selected = clickedName))
  }

  private def items =
    menuNames.map(n =>
      MenuItem(name = n, active = state.selected == n, onClick = onClick).withKey(n))

  private def subItems =
    subMenuNames.map(n =>
      MenuItem(name = n, active = state.selected == n, onClick = onClick).withKey(n))

  override def render(): ReactElement =
    div(Menu()(
          items,
          MenuMenu(position = VerticalPosition.right)(
            subItems,
          )
        ),
        CodeSection(code = sourceAsString))
}

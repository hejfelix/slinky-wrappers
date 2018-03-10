package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.semanticui.{Button, EventHandler, Header, Position}
import com.lambdaminute.slinkywrappers.semanticui.menu.{Menu, MenuItem, MenuMenu}
import slinky.core.{Component, StatelessComponent}
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.div

@react class SemanticUiDemo extends StatelessComponent {

  type Props = Unit

  override def render(): ReactElement = div(
    Header()("Semantic UI Wrappers"),
    MenuDemo(),
    Button(primary = true)("Primary"),
    Button()("Secondary")
  )

}

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

  private def items = menuNames.map(n => MenuItem(name = n, active = state.selected == n, onClick = onClick).withKey(n))
  private def subItems =
    subMenuNames.map(n => MenuItem(name = n, active = state.selected == n, onClick = onClick).withKey(n))

  override def render(): ReactElement =
    Menu()(
      items,
      MenuMenu(position = Position.right)(
        subItems,
      )
    )
}

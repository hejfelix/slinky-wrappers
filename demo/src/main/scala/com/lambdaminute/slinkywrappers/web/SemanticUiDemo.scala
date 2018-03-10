package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.semanticui._
import com.lambdaminute.slinkywrappers.semanticui.menu.{Menu, MenuItem, MenuMenu}
import com.lambdaminute.slinkywrappers.semanticui.table._
import slinky.core.{Component, StatelessComponent}
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.div

@react class SemanticUiDemo extends StatelessComponent {

  type Props = Unit

  override def render(): ReactElement = div(
    Header()("Semantic UI Wrappers"),
    Button(primary = true, animated = "vertical")(ButtonContent(visible = true)("Go"),
                                                  ButtonContent(hidden = true)(Icon(name = IconName.`arrow right`))),
    Button()("Secondary"),
    MenuDemo(),
    TableDemo(),
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
      MenuMenu(position = VerticalPosition.right)(
        subItems,
      )
    )
}

@react class TableDemo extends StatelessComponent {
  type Props = Unit

  private val headers = TableHeader(TableRow()(TableHeaderCell(colSpan = 2)("Things"), TableHeaderCell()("Co-things")))

  private val body = TableBody(
    TableRow()(TableCell(collapsing = true)("Egg"), TableCell(collapsing = true)("Banana"), TableCell()("Cow"))
  )

  override def render(): ReactElement = Table()(
    headers,
    body
  )
}

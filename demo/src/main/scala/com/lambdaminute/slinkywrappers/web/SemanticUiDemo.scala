package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.macros.Macros.sourceAsString
import com.lambdaminute.slinkywrappers.semanticui.Width.{`16` => _16, `2` => _2, `8` => _8}
import com.lambdaminute.slinkywrappers.semanticui._
import com.lambdaminute.slinkywrappers.semanticui.menu.{Menu, MenuItem}
import com.lambdaminute.slinkywrappers.semanticui.table._
import com.lambdaminute.slinkywrappers.web.semantic.ListDemo
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.core.{Component, StatelessComponent}
import slinky.web.html.div
import Width.{`3` => _3, `13` => _13}
@react class SemanticUiDemo extends Component {

  case class State(activeElement: ReactElement = div())
  type Props = Unit

  private val demos = List(
    "Table" -> TableDemo(),
    "Menu"  -> MenuDemo(),
    "List"  -> ListDemo()
  )

  private def grid = Grid(columns = _2)(
    GridRow(
      GridColumn(width = _3)(menu),
      GridColumn(width = _13)(state.activeElement)
    )
  )

  override def initialState = State()

  private def onClickAction(changeTo: ReactElement): EventHandler =
    (_, _) => this.setState(_.copy(activeElement = changeTo))

  private def menu = Menu(vertical = true)(
    demos.map {
      case (name, element) => MenuItem(name = name, onClick = onClickAction(element)).withKey(name)
    }
  )

  override def render(): ReactElement = div(grid)

}
@react class TableDemo extends StatelessComponent {
  type Props = Unit

  private val headers = TableHeader(TableRow(TableHeaderCell(colSpan = 2)("Things"), TableHeaderCell("Co-things")))

  private val body = TableBody(
    TableRow(TableCell(collapsing = true)("Egg"), TableCell(collapsing = true)("Banana"), TableCell("Cow"))
  )
  override def render(): ReactElement =
    div(Table(
          headers,
          body
        ),
        CodeSection(code = sourceAsString))
}

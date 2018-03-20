package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.macros.Macros.sourceAsString
import com.lambdaminute.slinkywrappers.semanticui._
import com.lambdaminute.slinkywrappers.semanticui.table._
import com.lambdaminute.slinkywrappers.web.semantic.ImageDemo
import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.div

@react class SemanticUiDemo extends StatelessComponent {

  type Props = Unit

  override def render(): ReactElement = div(
    Header()("Semantic UI Wrappers"),
    Container()(
      Button(primary = true, animated = "vertical")(ButtonContent(visible = true)("Go"),
                                                    ButtonContent(hidden = true)(Icon(name = IconName.`arrow right`))),
      Button()("Secondary"),
      MenuDemo(),
      TableDemo(),
      ImageDemo()
    )
  )

}
@react class TableDemo extends StatelessComponent {
  type Props = Unit

  private val headers = TableHeader(TableRow()(TableHeaderCell(colSpan = 2)("Things"), TableHeaderCell()("Co-things")))

  private val body = TableBody(
    TableRow()(TableCell(collapsing = true)("Egg"), TableCell(collapsing = true)("Banana"), TableCell()("Cow"))
  )
  override def render(): ReactElement =
    div(Table()(
          headers,
          body
        ),
        CodeSection(code = sourceAsString))
}

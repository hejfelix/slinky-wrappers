package com.lambdaminute.slinkywrappers.semanticui

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}
import slinky.core.annotations.react
import slinky.core.{ExternalComponent, ExternalComponentNoPropsWithAttributes}

package object table {

  @react object Table extends ExternalComponent {
    case class Props(attached: UndefOr[Attached | Boolean] = js.undefined)
    override val component = SemanticUiReact.Table
  }

  object TableBody extends ExternalComponentNoPropsWithAttributes {
    override val component = SemanticUiReact.Table.Body
  }

  object TableHeader extends ExternalComponentNoPropsWithAttributes {
    override val component = SemanticUiReact.Table.Header
  }

  @react object TableHeaderCell extends ExternalComponent {
    case class Props(colSpan: UndefOr[Int] = js.undefined)
    override val component = SemanticUiReact.Table.HeaderCell
  }

  @react object TableCell extends ExternalComponent {
    case class Props(
        collapsing: UndefOr[Boolean] = js.undefined,
        textAlign: UndefOr[Position] = js.undefined
    )
    override val component = SemanticUiReact.Table.Cell
  }

  @react object TableRow extends ExternalComponent {
    case class Props(error: UndefOr[Boolean] = js.undefined)
    override val component = SemanticUiReact.Table.Row
  }

}

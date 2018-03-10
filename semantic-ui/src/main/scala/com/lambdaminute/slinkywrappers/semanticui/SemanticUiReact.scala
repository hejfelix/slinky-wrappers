package com.lambdaminute.slinkywrappers.semanticui

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{|, UndefOr}
import slinky.core.annotations.react
import slinky.core.{ExternalComponent, ExternalComponentNoProps}
import slinky.readwrite.Writer

@JSImport("semantic-ui-react", JSImport.Default)
@js.native
object SemanticUiReact extends js.Object {

  val Button: js.Object    = js.native
  val Container: js.Object = js.native
  val Divider: js.Object   = js.native
  val Header: js.Object    = js.native
  val Checkbox: js.Object  = js.native

  @js.native
  object Table extends js.Object {
    val Header: js.Object     = js.native
    val HeaderCell: js.Object = js.native
    val Cell: js.Object       = js.native
    val Row: js.Object        = js.native
    val Body: js.Object       = js.native
  }

  @js.native
  object Menu extends js.Object {
    val Menu: js.Object = js.native
    val Item: js.Object = js.native
  }

}

object Divider extends ExternalComponentNoProps {
  override val component = SemanticUiReact.Divider
}

@react object Header extends ExternalComponent {
  case class Props(as: UndefOr[String] = js.undefined)
  override val component = SemanticUiReact.Header
}

object Container extends ExternalComponentNoProps {
  override val component = SemanticUiReact.Container
}

@react object Checkbox extends ExternalComponent {
  case class Props(checked: UndefOr[Boolean] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   label: UndefOr[String] = js.undefined,
                   onChange: UndefOr[EventHandler] = js.undefined,
                   indeterminate: UndefOr[Boolean] = js.undefined,
  )
  override val component = SemanticUiReact.Checkbox
}

@react object Button extends ExternalComponent {
  case class Props(primary: UndefOr[Boolean] = js.undefined,
                   basic: UndefOr[Boolean] = js.undefined,
                   onClick: UndefOr[EventHandler] = js.undefined)
  override val component = SemanticUiReact.Button
}

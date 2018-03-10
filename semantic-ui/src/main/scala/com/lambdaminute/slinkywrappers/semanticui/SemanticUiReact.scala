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

  // Elements

  @js.native
  object Button extends js.Object {
    val Content: js.Object = js.native
    val Group: js.Object   = js.native
    val Or: js.Object      = js.native
  }
  val Container: js.Object = js.native
  val Divider: js.Object   = js.native
  val Flag: js.Object      = js.native
  val Header: js.Object    = js.native
  val Icon: js.Object      = js.native
  val Image: js.Object     = js.native
  val Input: js.Object     = js.native
  val Label: js.Object     = js.native
  val List: js.Object      = js.native
  val Loader: js.Object    = js.native
  val Rail: js.Object      = js.native
  val Reveal: js.Object    = js.native
  val Segment: js.Object   = js.native
  val Step: js.Object      = js.native

  // Collections

  val Breadcrumb: js.Object = js.native
  val Form: js.Object       = js.native
  val Grid: js.Object       = js.native
  val Message: js.Object    = js.native

  @js.native
  object Menu extends js.Object {
    val Menu: js.Object = js.native
    val Item: js.Object = js.native
  }

  @js.native
  object Table extends js.Object {
    val Header: js.Object     = js.native
    val HeaderCell: js.Object = js.native
    val Cell: js.Object       = js.native
    val Row: js.Object        = js.native
    val Body: js.Object       = js.native
  }

  // Views

  val Advertisement: js.Object = js.native
  val Card: js.Object          = js.native
  val Comment: js.Object       = js.native
  val Feed: js.Object          = js.native
  val Item: js.Object          = js.native
  val Statistic: js.Object     = js.native

  // Modules

  val Accordion: js.Object  = js.native
  val Checkbox: js.Object   = js.native
  val Dimmer: js.Object     = js.native
  val Dropdown: js.Object   = js.native
  val Embed: js.Object      = js.native
  val Modal: js.Object      = js.native
  val Popup: js.Object      = js.native
  val Progress: js.Object   = js.native
  val Rating: js.Object     = js.native
  val Search: js.Object     = js.native
  val Sidebar: js.Object    = js.native
  val Sticky: js.Object     = js.native
  val Tab: js.Object        = js.native
  val Transition: js.Object = js.native

  // Behaviors

  val Visibility: js.Object = js.native

  // Addons

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
  case class Props(active: UndefOr[Boolean] = js.undefined,
                   animated: UndefOr[String] = js.undefined,
                   as: UndefOr[String] = js.undefined,
                   attached: UndefOr[Boolean | Attached] = js.undefined,
                   basic: UndefOr[Boolean] = js.undefined,
                   circular: UndefOr[Boolean] = js.undefined,
                   className: UndefOr[String] = js.undefined,
                   color: UndefOr[Color] = js.undefined,
                   compact: UndefOr[Boolean] = js.undefined,
                   content: UndefOr[js.Object] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   floated: UndefOr[Boolean] = js.undefined,
                   primary: UndefOr[Boolean] = js.undefined,
                   onClick: UndefOr[EventHandler] = js.undefined)
  override val component = SemanticUiReact.Button
}

@react object ButtonContent extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      content: UndefOr[js.Object] = js.undefined,
      hidden: UndefOr[Boolean] = js.undefined,
      visible: UndefOr[Boolean] = js.undefined
  )
  override val component = SemanticUiReact.Button.Content
}

@react object ButtonGroup extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      basic: UndefOr[Boolean] = js.undefined,
      buttons: UndefOr[js.Array[js.Object]] = js.undefined,
      className: UndefOr[String] = js.undefined,
      color: UndefOr[Color] = js.undefined,
      compact: UndefOr[Boolean] = js.undefined,
      content: UndefOr[js.Object] = js.undefined,
      floated: UndefOr[FloatedVertical] = js.undefined,
      fluid: UndefOr[Boolean] = js.undefined,
      icon: UndefOr[Boolean] = js.undefined,
      inverted: UndefOr[Boolean] = js.undefined,
      labeled: UndefOr[Boolean] = js.undefined,
      negative: UndefOr[Boolean] = js.undefined,
      positive: UndefOr[Boolean] = js.undefined,
      primary: UndefOr[Boolean] = js.undefined,
      secondary: UndefOr[Boolean] = js.undefined,
      size: UndefOr[Size] = js.undefined,
      toggle: UndefOr[Boolean] = js.undefined,
      vertical: UndefOr[Boolean] = js.undefined,
      widths: UndefOr[Width] = js.undefined,
  )
  override val component = SemanticUiReact.Button.Content
}

@react object ButtonOr extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      text: UndefOr[String | Double] = js.undefined
  )
  override val component = SemanticUiReact.Button.Or
}

@react object Icon extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      bordered: UndefOr[Boolean] = js.undefined,
      circular: UndefOr[Boolean] = js.undefined,
      className: UndefOr[String] = js.undefined,
      color: UndefOr[Color] = js.undefined,
      corner: UndefOr[Boolean] = js.undefined,
      disabled: UndefOr[Boolean] = js.undefined,
      fitted: UndefOr[Boolean] = js.undefined,
      flipped: UndefOr[Flipped] = js.undefined,
      inverted: UndefOr[Boolean] = js.undefined,
      link: UndefOr[Boolean] = js.undefined,
      loading: UndefOr[Boolean] = js.undefined,
      name: UndefOr[IconName] = js.undefined,
      rotated: UndefOr[Rotated] = js.undefined,
      size: UndefOr[Size] = js.undefined,
  )
  override val component = SemanticUiReact.Icon
}

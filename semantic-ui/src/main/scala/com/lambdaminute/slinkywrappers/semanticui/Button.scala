package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

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
                   floated: UndefOr[FloatedVertical] = js.undefined,
                   fluid: UndefOr[Boolean] = js.undefined,
                   icon: UndefOr[IconName] = js.undefined,
                   inverted: UndefOr[Boolean] = js.undefined,
                   label: UndefOr[String | js.Object] = js.undefined,
                   labelPosition: UndefOr[VerticalPosition] = js.undefined,
                   loading: UndefOr[Boolean] = js.undefined,
                   negative: UndefOr[Boolean] = js.undefined,
                   onClick: UndefOr[EventHandler] = js.undefined,
                   positive: UndefOr[Boolean] = js.undefined,
                   primary: UndefOr[Boolean] = js.undefined,
                   secondary: UndefOr[Boolean] = js.undefined,
                   size: UndefOr[Size] = js.undefined,
                   tabIndex: UndefOr[Int | String] = js.undefined,
                   toggle: UndefOr[Boolean] = js.undefined)
  override val component = SemanticUiReact.Button
}

package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

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

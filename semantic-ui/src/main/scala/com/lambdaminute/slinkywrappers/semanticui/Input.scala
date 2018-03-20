package com.lambdaminute.slinkywrappers.semanticui

import com.lambdaminute.slinkywrappers.semanticui.Spacing._
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object Input extends ExternalComponent {

  type LabelPosition = left.type | right.type | `left corner`.type | `right corner`.type

  case class Props(
      action: UndefOr[Boolean | js.Any] = js.undefined,
      actionPosition: UndefOr[left.type] = js.undefined,
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      disabled: UndefOr[Boolean] = js.undefined,
      error: UndefOr[Boolean] = js.undefined,
      fluid: UndefOr[Boolean] = js.undefined,
      focus: UndefOr[Boolean] = js.undefined,
      icon: UndefOr[Boolean | Icon.type] = js.undefined,
      iconPosition: UndefOr[left.type] = js.undefined,
      input: UndefOr[js.Any] = js.undefined,
      inverted: UndefOr[Boolean] = js.undefined,
      label: UndefOr[js.Any] = js.undefined,
      labelPosition: UndefOr[LabelPosition] = js.undefined,
      loading: UndefOr[Boolean] = js.undefined,
      onChange: UndefOr[EventHandler] = js.undefined,
      size: UndefOr[Size] = js.undefined,
      tabIndex: UndefOr[Int | String] = js.undefined,
      transparent: UndefOr[Boolean] = js.undefined,
      `type`: UndefOr[String] = js.undefined
  )
  override val component = SemanticUiReact.Input
}

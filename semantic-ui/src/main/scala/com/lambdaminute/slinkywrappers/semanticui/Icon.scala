package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

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

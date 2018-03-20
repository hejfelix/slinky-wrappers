package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Image extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      avatar: UndefOr[Boolean] = js.undefined,
      bordered: UndefOr[Boolean] = js.undefined,
      centered: UndefOr[Boolean] = js.undefined,
      circular: UndefOr[Boolean] = js.undefined,
      className: UndefOr[Boolean] = js.undefined,
      content: UndefOr[ReactElement] = js.undefined,
      dimmer: UndefOr[js.Any] = js.undefined,
      disabled: UndefOr[Boolean] = js.undefined,
      floated: UndefOr[FloatedVertical] = js.undefined,
      fluid: UndefOr[js.Any] = js.undefined,
      hidden: UndefOr[Boolean] = js.undefined,
      href: UndefOr[String] = js.undefined,
      `inline`: UndefOr[Boolean] = js.undefined,
      label: UndefOr[js.Any] = js.undefined,
      rounded: UndefOr[Boolean] = js.undefined,
      size: UndefOr[Size] = js.undefined,
      spaced: UndefOr[VerticalPosition] = js.undefined,
      src: UndefOr[String] = js.undefined,
      ui: UndefOr[Boolean] = js.undefined,
      verticalAlign: UndefOr[VerticalAlign] = js.undefined,
      wrapped: UndefOr[Boolean] = js.undefined
  )
  override val component = SemanticUiReact.Image
}

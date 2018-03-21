package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr

object LabelGroup extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      circular: UndefOr[Boolean] = js.undefined,
      className: UndefOr[String] = js.undefined,
      color: UndefOr[Color] = js.undefined,
      content: UndefOr[ReactElement] = js.undefined,
      size: UndefOr[Size] = js.undefined,
      tag: UndefOr[Boolean] = js.undefined,
  )
  override val component = SemanticUiReact.Label.Group
}

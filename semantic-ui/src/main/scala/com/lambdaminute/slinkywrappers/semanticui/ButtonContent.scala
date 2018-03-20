package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

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

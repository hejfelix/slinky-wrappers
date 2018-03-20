package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Accordion extends ExternalComponent {
  case class Props(
      className: UndefOr[String] = js.undefined,
      fluid: UndefOr[Boolean] = js.undefined,
      inverted: UndefOr[Boolean] = js.undefined,
      styled: UndefOr[Boolean] = js.undefined,
  )
  override val component = SemanticUiReact.Accordion
}

package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Header extends ExternalComponent {
  case class Props(as: UndefOr[String] = js.undefined)
  override val component = SemanticUiReact.Header
}

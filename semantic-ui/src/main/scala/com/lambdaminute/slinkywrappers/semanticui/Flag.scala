package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Flag extends ExternalComponent {
  case class Props(as: UndefOr[String] = js.undefined, className: UndefOr[String] = js.undefined, name: String)
  override val component = SemanticUiReact.Flag
}

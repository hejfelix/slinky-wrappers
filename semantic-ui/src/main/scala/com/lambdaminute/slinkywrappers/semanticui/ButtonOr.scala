package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

@react object ButtonOr extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      text: UndefOr[String | Double] = js.undefined
  )
  override val component = SemanticUiReact.Button.Or
}

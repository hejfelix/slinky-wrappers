package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

@react object Container extends ExternalComponent {
  case class Props(as: UndefOr[String] = js.undefined,
                   className: UndefOr[String] = js.undefined,
                   content: UndefOr[ReactElement] = js.undefined,
                   fluid: UndefOr[Boolean] = js.undefined,
                   text: UndefOr[Boolean] = js.undefined,
                   textAlign: UndefOr[VerticalPosition | CenterPosition] = js.undefined)
  override val component = SemanticUiReact.Container
}

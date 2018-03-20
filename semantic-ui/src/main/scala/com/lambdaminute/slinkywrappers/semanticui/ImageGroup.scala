package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object ImageGroup extends ExternalComponent {

  case class Props(className: UndefOr[String] = js.undefined,
                   content: UndefOr[ReactElement] = js.undefined,
                   size: UndefOr[Size] = js.undefined)

  override val component = SemanticUiReact.Image.Group
}

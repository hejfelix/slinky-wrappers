package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Checkbox extends ExternalComponent {
  case class Props(checked: UndefOr[Boolean] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   label: UndefOr[String] = js.undefined,
                   onChange: UndefOr[EventHandler] = js.undefined,
                   indeterminate: UndefOr[Boolean] = js.undefined,
  )
  override val component = SemanticUiReact.Checkbox
}

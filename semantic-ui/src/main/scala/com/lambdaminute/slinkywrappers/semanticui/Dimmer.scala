package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

@react object Dimmer extends ExternalComponent {
  case class Props(active: Boolean)
  override val component = SemanticUiReact.Dimmer
}
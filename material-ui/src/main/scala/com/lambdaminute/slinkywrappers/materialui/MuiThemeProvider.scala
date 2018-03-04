package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object MuiThemeProvider extends ExternalComponent {
  case class Props(disableStylesGeneration: UndefOr[Boolean] = js.undefined,
                   sheetsManager: UndefOr[js.Object] = js.undefined,
                   theme: js.Object)
  override val component = MaterialUi.MuiThemeProvider
}

package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import scala.scalajs.js
import scala.scalajs.js.{UndefOr}

@react object IconButton extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined,
                   color: UndefOr[color] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   disableRipple: UndefOr[Boolean] = js.undefined)
  override val component = MaterialUi.IconButton
}

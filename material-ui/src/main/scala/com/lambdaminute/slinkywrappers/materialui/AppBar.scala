package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

@react object AppBar extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined, color: UndefOr[color] = js.undefined, position: UndefOr[position] = js.undefined)
  override val component = MaterialUi.AppBar
}

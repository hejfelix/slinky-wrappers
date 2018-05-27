package com.lambdaminute.slinkywrappers.materialui

import com.sun.org.apache.xpath.internal.operations.Bool
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Toolbar extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined, disableGutters: UndefOr[Bool] = js.undefined)
  override val component = MaterialUi.Toolbar
}

package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSImport

@JSImport("material-ui", JSImport.Default)
@js.native
object MaterialUi extends js.Object {
  val Button: js.Object = js.native
}

@react object Button extends ExternalComponent {
  case class Props(color: UndefOr[String] = js.undefined,
                   variant: UndefOr[String] = js.undefined,
                   size: UndefOr[String] = js.undefined)
  override val component = MaterialUi.Button
}

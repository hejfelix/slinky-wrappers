package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}
import Auto._

@react object GridList extends ExternalComponent {
  case class Props(
                  cellHeight: UndefOr[Int | auto.type] = js.undefined,
                  className: UndefOr[String] = js.undefined,
                  cols: UndefOr[Int] = js.undefined,
                  component: UndefOr[String | js.Function] = js.undefined,
                  spacing: UndefOr[Int] = js.undefined
                  )
  override val component = MaterialUi.GridList
}

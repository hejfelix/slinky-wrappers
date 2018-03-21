package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object GridRow extends ExternalComponent {
  case class Props(

                    as:UndefOr[String] = js.undefined,
                    centered:UndefOr[Boolean] = js.undefined,
                    className:UndefOr[String] = js.undefined,
                    color:UndefOr[Color] = js.undefined,
                    columns:UndefOr[Number] = js.undefined,
                    divided:UndefOr[Boolean] = js.undefined,
                    only:UndefOr[String] = js.undefined,
                    reversed:UndefOr[String] = js.undefined,
                    stretched:UndefOr[Boolean] = js.undefined
                  )
  override val component = SemanticUiReact.Grid.Row

}

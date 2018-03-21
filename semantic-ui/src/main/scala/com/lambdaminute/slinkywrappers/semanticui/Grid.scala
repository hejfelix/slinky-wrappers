package com.lambdaminute.slinkywrappers.semanticui

import com.lambdaminute.slinkywrappers.semanticui.Adverbs.{horizontally, internally, vertically, very}
import com.lambdaminute.slinkywrappers.semanticui.Spacing._
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object Grid extends ExternalComponent {
  type TextAlign     = left.type | center.type | right.type | justified.type
  type VerticalAlign = bottom.type | middle.type | top.type
  case class Props(
      as: UndefOr[String] = js.undefined,
      celled: UndefOr[Boolean | internally.type] = js.undefined,
      centered: UndefOr[Boolean] = js.undefined,
      className: UndefOr[String] = js.undefined,
      columns: UndefOr[Columns] = js.undefined,
      container: UndefOr[Boolean] = js.undefined,
      divided: UndefOr[Boolean | vertically.type] = js.undefined,
      doubling: UndefOr[Boolean] = js.undefined,
      inverted: UndefOr[Boolean] = js.undefined,
      padded: UndefOr[Boolean | horizontally.type | vertically.type] = js.undefined,
      relaxed: UndefOr[Boolean | very.type] = js.undefined,
      reversed: UndefOr[String] = js.undefined,
      stackable: UndefOr[Boolean] = js.undefined,
      stretched: UndefOr[Boolean] = js.undefined,
      textAlign: UndefOr[TextAlign] = js.undefined,
      verticalAlign: UndefOr[VerticalAlign] = js.undefined
  )

  override val component = SemanticUiReact.Grid
}

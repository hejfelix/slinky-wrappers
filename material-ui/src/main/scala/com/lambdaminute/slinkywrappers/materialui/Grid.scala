package com.lambdaminute.slinkywrappers.materialui

import java.awt.Container

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}
import AlignContent._
import Direction._
import Sizes._
import Wrap._
@react object Grid extends ExternalComponent {
  case class Props(
      alignContent: UndefOr[AlignContent] = js.undefined,
      alignItems: UndefOr[AlignItems] = js.undefined,
      className: UndefOr[String] = js.undefined,
      component: UndefOr[String | js.Function] = js.undefined,
      container: UndefOr[Boolean] = js.undefined,
      direction: UndefOr[Direction] = js.undefined,
      item: UndefOr[Boolean] = js.undefined,
      justify: UndefOr[Justify] = js.undefined,
      lg: UndefOr[Sizes] = js.undefined,
      md: UndefOr[Sizes] = js.undefined,
      sm: UndefOr[Sizes] = js.undefined,
      spacing: UndefOr[Spacing] = js.undefined,
      wrap: UndefOr[Wrap] = js.undefined,
      xl: UndefOr[Sizes] = js.undefined,
      xs: UndefOr[Sizes] = js.undefined,
      zeroMinWidth: UndefOr[Boolean] = js.undefined,
  )
  override val component = MaterialUi.Grid
}

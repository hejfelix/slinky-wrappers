package com.lambdaminute.slinkywrappers.semanticui

import com.lambdaminute.slinkywrappers.semanticui.Spacing._
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object ListIcon extends ExternalComponent {
  case class Props(
      className: UndefOr[String] = js.undefined,
      name: UndefOr[IconName] = js.undefined,
      verticalAlign: UndefOr[bottom.type | middle.type | top.type] = js.undefined
  )
  override val component = SemanticUiReact.List.Icon
}

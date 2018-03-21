package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

@react object ListContent extends ExternalComponent {

  case class Props(
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      content: UndefOr[ReactElement] = js.undefined,
      description: UndefOr[ListDescription.type] = js.undefined,
      floated: UndefOr[Spacing.left.type | Spacing.right.type] = js.undefined,
      header: UndefOr[ListHeader.type] = js.undefined,
      verticalAlign: UndefOr[Spacing.bottom.type | Spacing.middle.type | Spacing.top.type] = js.undefined,
  )

  override val component = SemanticUiReact.List.Content

}

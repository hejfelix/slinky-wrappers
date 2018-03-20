package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object AccordionAccordion extends ExternalComponent {
  case class Props(
      activeIndex: UndefOr[js.Object] = js.undefined,
      as: UndefOr[js.Object] = js.undefined,
      className: UndefOr[String] = js.undefined,
      defaultActiveIndex: UndefOr[Int] = js.undefined,
      exclusive: UndefOr[Boolean] = js.undefined,
      onTitleClick: UndefOr[EventHandler] = js.undefined,
      panels: UndefOr[List[ReactElement]] = js.undefined
  )
  override val component = SemanticUiReact.Accordion.Accordion
}

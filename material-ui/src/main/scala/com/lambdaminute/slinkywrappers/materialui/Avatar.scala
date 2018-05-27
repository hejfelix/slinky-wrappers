package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Avatar extends ExternalComponent {
  case class Props(alt: UndefOr[String] = js.undefined,
                   className: UndefOr[String] = js.undefined,
                   component: UndefOr[String] = js.undefined,
                   imgProps: UndefOr[js.Object] = js.undefined,
                   sizes: UndefOr[String] = js.undefined,
                   src: UndefOr[String] = js.undefined,
                   srcSet: UndefOr[String] = js.undefined)

  override val component = MaterialUi.Avatar

}

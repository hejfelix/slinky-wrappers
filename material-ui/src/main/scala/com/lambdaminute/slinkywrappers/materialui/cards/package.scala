package com.lambdaminute.slinkywrappers.materialui

import slinky.core.{ExternalComponent, ReactComponentClass}
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

package object cards {

  @react object Card extends ExternalComponent {
    case class Props(className: UndefOr[String] = js.undefined, raised: UndefOr[Boolean] = js.undefined)
    override val component = MaterialUi.Card
  }

  @react object CardActions extends ExternalComponent {
    case class Props(className: UndefOr[String] = js.undefined, disableActionSpacing: UndefOr[Boolean] = js.undefined)
    override val component = MaterialUi.CardActions
  }

  @react object CardContent extends ExternalComponent {
    case class Props(component: UndefOr[String | js.Function] = js.undefined)
    override val component = MaterialUi.CardContent
  }
  @react object CardHeader extends ExternalComponent {
    case class Props(action: UndefOr[ReactComponentClass] = js.undefined,
                     avatar: UndefOr[ReactComponentClass] = js.undefined,
                     className: UndefOr[String] = js.undefined,
                     component: UndefOr[String | js.Function] = js.undefined,
                     subheader: UndefOr[ReactComponentClass] = js.undefined,
                     title: UndefOr[ReactComponentClass] = js.undefined)
    override val component = MaterialUi.CardHeader
  }
  @react object CardMedia extends ExternalComponent {
    case class Props(className: UndefOr[String] = js.undefined,
                     component: UndefOr[String | js.Function] = js.undefined,
                     image: UndefOr[String] = js.undefined,
                     src: UndefOr[String] = js.undefined)
    override val component = MaterialUi.CardMedia
  }

}

package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.annotations.react
import slinky.core.{ExternalComponent, ExternalComponentWithAttributes}
import slinky.web.html.*

import scala.scalajs.js
import scala.scalajs.js.UndefOr

package object menu {

  @react object Menu extends ExternalComponent {
    case class Props(active: UndefOr[Boolean] = js.undefined,
                     vertical: UndefOr[Boolean] = js.undefined,
                     secondary: UndefOr[Boolean] = js.undefined,
                     pointing: UndefOr[Boolean] = js.undefined)
    override val component = SemanticUiReact.Menu

  }

  @react object MenuItem extends ExternalComponentWithAttributes[*.tag.type] {
    case class Props(active: UndefOr[Boolean] = js.undefined,
                     name: UndefOr[String] = js.undefined,
                     header: UndefOr[Boolean] = js.undefined,
                     onClick: UndefOr[EventHandler] = js.undefined,
                     as: UndefOr[String] = js.undefined)
    override val component = SemanticUiReact.Menu.Item
  }

  @react object MenuMenu extends ExternalComponent {
    case class Props(position: UndefOr[VerticalPosition] = js.undefined)
    override val component = SemanticUiReact.Menu.Menu
  }

}

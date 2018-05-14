package com.lambdaminute.slinkywrappers.reactrouter

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-router", JSImport.Default)
@js.native
object ReactRouter extends js.Object {
  private[reactrouter] def withRouter: js.Function1[ReactComponentClass,js.Function1[js.Object,ReactElement]] = js.native
}

//@react object withRouter extends ExternalComponent {
//  case class Props(Component: ReactComponentClass)
//  override val component = ReactRouter.withRouter
//}

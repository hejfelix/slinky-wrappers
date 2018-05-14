package com.lambdaminute.slinkywrappers

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement

import scala.scalajs.js

package object reactrouter {

  def withRouter(rc:ReactComponentClass): ReactElement =
    ReactRouter.withRouter(rc)(js.Object())


}

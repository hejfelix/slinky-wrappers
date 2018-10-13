package com.lambdaminute.slinkywrappers.reactrouter

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.readwrite.{MacroReaders, Reader}

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Route extends ExternalComponent with MacroReaders {

  def renderFunc(f: RouteProps => ReactElement)(implicit r: Reader[RouteProps]): js.Function =
    (obj: js.Object) => f(r.read(obj))

  def apply(path: String,
            render: RouteProps => ReactElement,
            exact: UndefOr[Boolean] = js.undefined,
            location: UndefOr[js.Object] = js.undefined,
            sensitive: UndefOr[Boolean] = js.undefined): ReactElement =
    this.apply(Props(path, renderFunc(render), exact, location, sensitive))

  case class Props(path: String,
                   render: UndefOr[js.Function],
                   exact: UndefOr[Boolean],
                   location: UndefOr[js.Object],
                   sensitive: UndefOr[Boolean])

  override val component = ReactRouterDom.Route

}

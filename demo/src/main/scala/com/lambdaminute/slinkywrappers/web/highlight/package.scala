package com.lambdaminute.slinkywrappers.web

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

package object highlight {

  @JSImport("react-syntax-highlight", JSImport.Default)
  @js.native
  object highlight extends js.Object

  @react object Highlight extends ExternalComponent {
    case class Props(lang: String, value: String)
    override val component = highlight
  }

}

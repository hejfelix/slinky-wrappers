package com.lambdaminute.slinkywrappers.semanticui

import javax.swing.Icon

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{|, UndefOr}
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.core.{ExternalComponent, ExternalComponentNoProps}
import slinky.readwrite.Writer

@JSImport("semantic-ui-react", JSImport.Default)
@js.native
object SemanticUiReact extends js.Object {

  // Elements

  @js.native
  object Button extends js.Object {
    val Content: js.Object = js.native
    val Group: js.Object   = js.native
    val Or: js.Object      = js.native
  }
  val Container: js.Object = js.native
  val Divider: js.Object   = js.native
  val Flag: js.Object      = js.native
  val Header: js.Object    = js.native
  val Icon: js.Object      = js.native
  @js.native
  object Image extends js.Object {
    val Group: js.Object = js.native
  }
  val Input: js.Object   = js.native
  val Label: js.Object   = js.native
  val List: js.Object    = js.native
  val Loader: js.Object  = js.native
  val Rail: js.Object    = js.native
  val Reveal: js.Object  = js.native
  val Segment: js.Object = js.native
  val Step: js.Object    = js.native

  // Collections

  val Breadcrumb: js.Object = js.native
  val Form: js.Object       = js.native
  val Grid: js.Object       = js.native
  val Message: js.Object    = js.native

  @js.native
  object Menu extends js.Object {
    val Menu: js.Object = js.native
    val Item: js.Object = js.native
  }

  @js.native
  object Table extends js.Object {
    val Header: js.Object     = js.native
    val HeaderCell: js.Object = js.native
    val Cell: js.Object       = js.native
    val Row: js.Object        = js.native
    val Body: js.Object       = js.native
  }

  // Views

  val Advertisement: js.Object = js.native
  val Card: js.Object          = js.native
  val Comment: js.Object       = js.native
  val Feed: js.Object          = js.native
  val Item: js.Object          = js.native
  val Statistic: js.Object     = js.native

  // Modules

  @js.native
  object Accordion extends js.Object {
    val Accordion: js.Object = js.native
    val Content: js.Object   = js.native
    val Title: js.Object     = js.native
  }
  val Checkbox: js.Object   = js.native
  val Dimmer: js.Object     = js.native
  val Dropdown: js.Object   = js.native
  val Embed: js.Object      = js.native
  val Modal: js.Object      = js.native
  val Popup: js.Object      = js.native
  val Progress: js.Object   = js.native
  val Rating: js.Object     = js.native
  val Search: js.Object     = js.native
  val Sidebar: js.Object    = js.native
  val Sticky: js.Object     = js.native
  val Tab: js.Object        = js.native
  val Transition: js.Object = js.native

  // Behaviors

  val Visibility: js.Object = js.native

  // Addons

}

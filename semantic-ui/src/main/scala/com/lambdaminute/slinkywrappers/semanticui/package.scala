package com.lambdaminute.slinkywrappers

import org.scalajs.dom.Event
import scala.scalajs.js
import slinky.readwrite.Writer

package object semanticui {
  type EventHandler = js.Function2[Event, js.Dynamic, Unit]

  sealed trait Position
  object Position {
    case object left  extends Position
    case object right extends Position
    implicit val writer: Writer[Position] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait Attached
  object Attached {
    case object top    extends Attached
    case object bottom extends Attached
    implicit val writer: Writer[Attached] = _.toString.asInstanceOf[js.Object]
  }

}

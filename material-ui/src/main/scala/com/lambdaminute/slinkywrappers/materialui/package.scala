package com.lambdaminute.slinkywrappers

import slinky.readwrite.Writer

import scala.scalajs.js

package object materialui {

  sealed trait color
  object color extends color {
    case object default   extends color
    case object inherit   extends color
    case object primary   extends color
    case object secondary extends color
    implicit val writer: Writer[color] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait size
  object size extends size {
    case object small  extends size
    case object medium extends size
    case object large  extends size
    implicit val writer: Writer[size] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait variant
  object variant extends variant {
    case object flat   extends variant
    case object raised extends variant
    case object fab    extends variant
    implicit val writer: Writer[variant] = _.toString.asInstanceOf[js.Object]
  }
}

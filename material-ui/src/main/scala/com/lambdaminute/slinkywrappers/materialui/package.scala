package com.lambdaminute.slinkywrappers

import slinky.readwrite.Writer

import scala.scalajs.js

package object materialui {

  trait EnumWriter {
    implicit val writer: Writer[this.type] = { name =>
      println(s"writing: ${name}")
      name.toString.asInstanceOf[js.Object]
    }
  }

  sealed trait Anchor
  object Anchor  {
    case object left   extends Anchor
    case object right  extends Anchor
    case object top    extends Anchor
    case object bottom extends Anchor
    implicit val writer: Writer[Anchor] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait color
  object color extends color {
    case object default   extends color
    case object inherit   extends color
    case object primary   extends color
    case object secondary extends color
    implicit val writer: Writer[color] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait textcolor
  object textcolor extends textcolor {
    case object inherit       extends textcolor
    case object primary       extends textcolor
    case object textSecondary extends textcolor
    case object secondary     extends textcolor
    case object error         extends textcolor
    case object default       extends textcolor
    implicit val writer: Writer[textcolor] = _.toString.asInstanceOf[js.Object]
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

  sealed trait textvariant
  object textvariant extends textvariant {
    case object display4   extends textvariant
    case object display3   extends textvariant
    case object display2   extends textvariant
    case object display1   extends textvariant
    case object headline   extends textvariant
    case object title      extends textvariant
    case object subheading extends textvariant
    case object body2      extends textvariant
    case object body1      extends textvariant
    case object caption    extends textvariant
    case object button     extends textvariant
    implicit val writer: Writer[textvariant] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait position
  object position extends position {
    case object fixed    extends position
    case object absolute extends position
    case object sticky   extends position
    case object static   extends position
    implicit val writer: Writer[position] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait align
  object align extends align {
    case object inherit extends align
    case object left    extends align
    case object center  extends align
    case object right   extends align
    case object justify extends align
    implicit val writer: Writer[align] = _.toString.asInstanceOf[js.Object]
  }

  // Theme stuff
  type Breakpoint                       = String
  type BreakPointsOptionsAndBreakPoints = BreakPoints with BreakpointsOptions
  type TypographyOptions                = js.Object
}

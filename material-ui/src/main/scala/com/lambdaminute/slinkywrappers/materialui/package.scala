package com.lambdaminute.slinkywrappers

import org.scalajs.dom.Event
import slinky.readwrite.Writer

import scala.scalajs.js
import scala.scalajs.js.|

package object materialui {

  type EventHandler = js.Function2[Event, js.Dynamic, Unit]

  trait EnumWriter {
    implicit val writer: Writer[this.type] = { name =>
      println(s"writing: ${name}")
      name.toString.asInstanceOf[js.Object]
    }
  }

  object Direction {
    case object row
    case object `row-reverse`
    case object column
    case object `column-reverse`

    type Direction = row.type | `row-reverse`.type | column.type | `column-reverse`.type
    implicit val writer: Writer[Direction] = _.toString.asInstanceOf[js.Object]
  }

  object AlignContent {
    case object stretch
    case object center
    case object `flex-start`
    case object `flex-end`
    case object `space-between`
    case object `space-around`
    case object baseline

    type AlignContent =
      stretch.type | center.type | `flex-start`.type | `flex-start`.type | `space-between`.type | `space-around`.type

    type AlignItems =
      `flex-start`.type | center.type | `flex-end`.type | stretch.type | baseline.type

    type Justify =
      `flex-start`.type | center.type | `flex-end`.type | `space-between`.type | `space-around`.type

    implicit val acriter: Writer[AlignContent] = _.toString.asInstanceOf[js.Object]
    implicit val atwriter: Writer[AlignItems]  = _.toString.asInstanceOf[js.Object]
    implicit val jwriter: Writer[Justify]      = _.toString.asInstanceOf[js.Object]
  }

  object Auto {
    case object auto
    implicit val w: Writer[auto.type] = _.toString.asInstanceOf[js.Object]
  }

  object Sizes {
    case object `0`
    case object `1`
    case object `2`
    case object `3`
    case object `4`
    case object `5`
    case object `6`
    case object `7`
    case object `8`
    case object `9`
    case object `10`
    case object `11`
    case object `12`

    case object `16`
    case object `24`
    case object `32`
    case object `40`

    case object `false`
    case object `true`

    type Sizes =
      `1`.type | `2`.type | `3`.type | `4`.type | `5`.type | `6`.type | `7`.type | `8`.type | `9`.type | `10`.type | `11`.type | `12`.type | Boolean

    type Spacing = `0`.type | `8`.type | `16`.type | `24`.type | `32`.type | `40`.type

    implicit val sw: Writer[Spacing] = _.toString.toInt.asInstanceOf[js.Object]

    implicit val w: Writer[Sizes] = s =>
      if (s.toString.forall(_.isDigit)) s.toString.toInt.asInstanceOf[js.Object] else s.asInstanceOf[js.Object]
  }

  object Wrap {
    case object nowrap
    case object wrap
    case object `wrap-reverse`
    type Wrap = nowrap.type | wrap.type | `wrap-reverse`.type

    implicit val w: Writer[Wrap] = _.toString.asInstanceOf[js.Object]
  }

  object Positions {
    case object top
    case object bottom
    type TitlePosition = top.type | bottom.type
    implicit val w: Writer[TitlePosition] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait Anchor
  object Anchor {
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
    case object flat     extends variant
    case object raised   extends variant
    case object fab      extends variant
    case object outlined extends variant
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

    type ActionPosition = left.type | right.type
    implicit val apw: Writer[ActionPosition] = _.toString.asInstanceOf[js.Object]
    implicit val writer: Writer[align]       = _.toString.asInstanceOf[js.Object]
  }

  // Theme stuff
  type Breakpoint                       = String
  type BreakPointsOptionsAndBreakPoints = BreakPoints with BreakpointsOptions
  type TypographyOptions                = js.Object
}

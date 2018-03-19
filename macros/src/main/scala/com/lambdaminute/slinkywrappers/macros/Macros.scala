package com.lambdaminute.slinkywrappers.macros
import scala.language.experimental.macros
import scala.reflect.macros.blackbox

object Macros {
  def sourceAsString: String = macro get_source_impl
  def get_source_impl(c: blackbox.Context): c.Expr[String] = {
    import c.universe._
    val fileAsString  = String.valueOf(c.enclosingPosition.source.content)
    val path = c.enclosingUnit.source.path
    val content = io.Source.fromFile(path).mkString
    c.Expr(Literal(Constant(content)))
  }
}

package org.deusaquilus

import scala.quoted._

trait MyEncoder[T]:
  def encode: String

trait TraitContext:
  inline def summonMyEncoder[T]: String =
    ${ SummonEncoder.impl[T] }

  implicit val encoderInstance: MyEncoder[String] =
    new MyEncoder[String] { def encode = "blah" }

  //given encoderInstance: MyEncoder[String] =
  //  new MyEncoder[String] { def encode = "blah" }

end TraitContext
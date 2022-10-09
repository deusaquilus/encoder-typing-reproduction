package org.deusaquilus

class Repo[T]:
  val ctx = new Context
  inline def summonEncoder = { import ctx._
    summonMyEncoder[T]
  }

object Use:
  val repo = new Repo[String]
  val v = repo.summonEncoder
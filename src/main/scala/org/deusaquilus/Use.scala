package org.deusaquilus

class Repo[T] extends TraitContext:
  inline def summonEncoder = {
    summonMyEncoder[T]
  }

object Use:
  val repo = new Repo[String]
  import repo._
  val v = repo.summonEncoder

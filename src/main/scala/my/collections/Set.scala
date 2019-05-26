package my.collections

trait Set extends (String => Boolean) {

  final def add(input: String): Set = element =>
    (element == input) || this(element)

  final def remove(input: String): Set = element =>
    (element != input) && this(element)

  final def union(that: Set): Set = element =>
    this(element) || that(element)

  final def intersection(that: Set): Set = element =>
    this(element) && that(element)

  final def difference(that: Set): Set = element =>
    this(element) && !that(element)

  final def isSubsetOf(that: Set): Set = element => ??? //todo

}

object Set {

  val empty: Set = _ => false

}

package fundamentals.level02

import fundamentals.level02.TypesExercises.Person

object ListExercises {

  /**
    * A `List` in Scala is a linked list.
    *
    * sealed trait List[+A]
    * case class ::[A](head: A, tail: List[A]) extends List[A]
    * case object Nil extends List[Nothing]
    *
    * You can create a List using the `::` constructor as such:
    *
    * scala> ::(1, ::(2, ::(3, Nil)))
    * = List(1, 2, 3)
    *
    * scala> (1 :: (2 :: (3 :: Nil)))
    * = List(1, 2, 3)
    *
    * scala> 1 :: 2 :: 3 :: Nil
    * = List(1, 2, 3)
    *
    * Often times, the `List.apply` static method is more convenient:
    *
    * scala> List.apply(1, 2, 3)
    *
    * The `apply` method in any object is the default method, so you can leave it out when using it:
    *
    * scala> List(1, 2, 3)
    */

  def prependToList[A](x: A, xs: List[A]): List[A] = ???

  def appendToList[A](x: A, xs: List[A]): List[A] = ???

  /**
    * Hint: Use pattern matching
    */
  def isEmptyList[A](xs: List[A]): Boolean = ???

  /**
    * scala> showListSize(List(1, 2, 3))
    * = "This is a list of size 3"
    *
    * scala> showListSize(List("ABC"))
    * = "This is a list of size 1
    *
    * scala> showListSize(Nil)
    * = "This is an empty list"
    *
    * Hint: Use pattern matching and string interpolation
    */
  def showListSize[A](xs: List[A]): String = ???

  /**
    * Mapping a function over a List
    *
    * This is typically what you want if the initial List and the resulting List
    * are of the same size.
    *
    * scala> addNumToEach(10, List(1, 2, 3))
    * = List(11, 12, 13)
    *
    * Hint: Use .map
    **/
  def addNumToEach(num: Int, nums: List[Int]): List[Int] = ???

  /**
    * Filter a List
    *
    * This is typically what you want if the size of the resulting List is <= that of the initial.
    *
    * Hint: Use .filter
    */
  def filterEven(nums: List[Int]): List[Int] = ???

  /**
    * Folds
    *
    * A fold is an operation over a data structure to yield a summary value.
    *
    * Examples: sum, product, min, max
    *
    * Hint: Use .foldLeft
    */

  /**
    * scala> product(List(2, 5, 3))
    * = 30
    *
    * https://en.wikipedia.org/wiki/Empty_product
    * scala> product(Nil)
    * = 1
    */
  def product(nums: List[Int]): Int = ???

  /**
    * scala> min(List(4, 6, 1))
    * = 1
    *
    * scala> min(Nil)
    * = Int.MinValue
    **/
  def min(nums: List[Int]): Int = ???

  /**
    * scala> val persons = List(Person("Bob", 22), Person("Sally", 21))
    * scala> youngestPerson(persons)
    * = Person("Sally", 21)
    *
    * scala> youngestPerson(Nil)
    * = Person("Nobody", 0)
    */
  def youngestPerson(persons: List[Person]): Person = ???

  /**
    * Typically in a data processing job, you would only want to log every
    * 100th or 1000th iteration so you do not clog up the logs.
    *
    * Hint: Use .zipWithIndex
    */
  def showEveryNthPerson(n: Int, persons: List[Person]): List[String] = ???

  /**
    * Given a list of `Person`s ordered by age in ascending order. Return all of those that are under 18.
    *
    * scala> val persons = List(Person("Bob", 16), Person("Jimmy", 17), Person("Sally", 18))
    * = List(Person("Bob", 16), Person("Jimmy", 17))
    *
    * Hint: Use .takeWhile
    */
  def retrieveMinors(orderedPersons: List[Person]): List[Person] = ???

}

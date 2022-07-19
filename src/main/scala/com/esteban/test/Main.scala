package com.esteban
package test

object Main {
  def main(args: Array[String]): Unit = {
    println("─" * 100)
    def deleteProducts(ids: Array[Int], m: Int): Int = {
      val dataPrep= ids.groupBy(identity).map(x => x._2.length).toList.sorted
      def recursiveDelete(list: List[Int], remove: Int): List[Int] = {
          val testCase = remove - list.head
          if (list.isEmpty || remove == 0 || testCase < 0) list
          else recursiveDelete(list.tail, testCase)
      }
        recursiveDelete(dataPrep, m).size
    }
    val testArray = Array(1, 1, 1, 2, 3, 2)
    println(s"${deleteProducts(testArray, 2)}")
    println("─" * 100)
  }
}

object HelloWorld {
  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4, 5)
    val list2 = List(2, 3, 5, 7)

    println(list.take(2))

    val newList = list.reduce((i, j) => Math.max(i, j))

    println(list)
    println(newList)

    val filteredList = list.filter(i => i > 2)

    println(list)
    println(filteredList)
  }

  def plus(left: Int, right: Int): Int = {
    left + right
  }
}
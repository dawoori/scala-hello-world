object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world 2!")
    val list = List(1, -2, -3, 4).map(x => Math.abs(x))
    val list2 = List(1, 2, 3, 4).reduce((x,y) => x*y)
    println(list)
    println(list2)
  }
}
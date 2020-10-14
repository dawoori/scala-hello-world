object HelloWorld {
  def main(args: Array[String]) {
    val x = 0
    def f(y: Int) = y + 1

    val result = {
      val x = f(3)
      println(x)
      x * x
    } + x

  }

  def plus(left: Int, right: Int): Int = {
    left + right
  }
}
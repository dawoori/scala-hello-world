class Pizza {
  var name = ""
  private var dough = ""
  private var topping = List()
  def setDough(dough: String): Unit = {
    this.dough = dough
  }

  def getDough(): String = {
    this.dough
  }
}

package example


trait Rice[A] {
  def snap(a: A): String
  def crackle(a: A): String
  def pop(a: A): String
}


object Rice {

  def apply[A](implicit rice: Rice[A]) = rice

//  def snap[A: Rice](a: A): String = Rice[A].snap(a)

  implicit class RiceOps[A: Rice](a: A) {
    def snap = Rice[A].snap(a)
    def crackle = Rice[A].crackle(a)
    def pop = Rice[A].pop(a)
  }

  implicit val intRice: Rice[Int] = new Rice[Int] {
    override def snap(a: Int): String = s"snap int: $a"
    override def crackle(a: Int): String = s"crackle int: $a"
    override def pop(a: Int): String = s"pop int: $a"
  }

  implicit val stringRice: Rice[String] = new Rice[String] {
    override def snap(a: String): String = s"snap string: $a"
    override def crackle(a: String): String = s"crackle string: $a"
    override def pop(a: String): String = s"pop string: $a"
  }
}


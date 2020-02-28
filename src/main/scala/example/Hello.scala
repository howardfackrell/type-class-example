package example
import Rice._

object Hello extends Greeting with App {
//step 1
//  println(snap(1))

//  the goal
  println(1.snap)
  println(1.crackle)
  println(1.pop)

  println("hello".snap)
  println("hello".crackle)
  println("hello".pop)
}

trait Greeting {
  lazy val greeting: String = "hello"
}

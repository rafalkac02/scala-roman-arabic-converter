import scala.io.StdIn.readLine

object Converter extends App {

  val numbers = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

  def toArabic(s: String):Int = {
    var sum = 0

    def sumRecursively(ls: List[Char]): Int = ls match {
      case Nil => 0
      case h :: Nil => numbers(h)
      case h :: t =>
        if (numbers(h) < numbers(t.head)) sum = sum - numbers(h) + sumRecursively(t)
        else sum += numbers(h) + sumRecursively(t)
        sum
    }

    sumRecursively(s.toUpperCase.toList)
  }

  println("This is roman-to-arabic numeral converter type 'q' at any point exit")
  var input = readLine("Type number in Roman notation: ")

  while(input.toLowerCase != "q") {
    println(s"Arabic notation is: ${toArabic(input)}")
    input = readLine("Type number in Roman notation: ")
  }
}
val numbers = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

def converter(s: String):Int = {
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

converter("CXXIV")

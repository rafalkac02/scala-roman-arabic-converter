
val numbers = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

numbers.keysIterator


for (c <- "cdaxvia") {
  if (numbers.keysIterator.contains(c.toUpper)) println(s"true for $c")
  else println(s"false for $c")
}


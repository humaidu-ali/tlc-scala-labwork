import scala.util.Random

// generate 6 unique random numbers between 1 and 49
// printed in ascending order

//[3, 7, 12, 15, 2, 40]
//[2, 3, 7, 12, 15, 40]

var numbers: List[Int] = List()
val size = 6
var count = 1
while (numbers.length != size) {
  // generate random number
  val randomNumber = Random.between(1, 50)
  println(s"Random number ${count}  ${randomNumber}")
  //check if number already exist
  if(!numbers.contains(randomNumber)) {
    numbers = numbers :+ randomNumber
  }
  count += 1
}

//print
numbers.foreach(println(_))
numbers = numbers.sortWith(_.compareTo(_) < 0)
numbers.foreach(println(_))

// Functional Programming

//double a value: x * 2
def doubleIt(value: Int): Int = value * 2

val result = doubleIt(5)
println(result)

val doubleIt2 = (value: Int) => value * 2
println(doubleIt2(5))

val doIt = (value: Int, f: (Int => Int)) => f(value)
// 5, doubleIt, ---------------------------- doubleIt(5)
doIt(5, doubleIt)

val squareIt = (value: Int) => value * value
doIt(5, squareIt)
//5, squareIt, -------- squareIt(5)

doIt(2, (value: Int) => value * value)
doIt(2, (value) => value * value)
doIt(2, value => value * value)
doIt(2, value => value * 3)
doIt(2, _ * 3)
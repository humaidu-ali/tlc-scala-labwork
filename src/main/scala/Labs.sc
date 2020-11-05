import java.text.SimpleDateFormat

// Converting Celsius to fahrenheit
def far(temp: Double): Double = (temp * 9/5) + 32
println(far(32))

// custom date formatter
def customDateConvert(date: String): Unit = {
  val format = new SimpleDateFormat("dd/mm/yy")
  val newDate = format.parse(date)
  println(newDate.toLocaleString)
}

customDateConvert("31/12/19")

val date = raw"""(d{4})-(d{2})-(d{2})""".r
"2004-01-20" match {
  case date(year, month, day) => s"$year was a good year for PLs."
}



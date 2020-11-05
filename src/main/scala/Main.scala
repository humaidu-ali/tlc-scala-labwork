object Main {
  def main(args: Array[String]): Unit = {
    val source = io.Source.fromFile("Trades.txt")
    for (record <- source.getLines) {
      val fields = record.split(",").map(_.trim)
      println(s"${fields(0)}\t${fields(3)}\t${fields(4)}")
    }
    source.close
  }
}

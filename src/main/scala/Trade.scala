class Trade {

  import java.time.LocalTime

  private var symbol = ""
  private var date = ""
  private var timestamp = 0L
  private var quantity = 0
  private var price = .0


  def this(symbol: String, date: String, timestamp: Long, quantity: Int, price: Double) {
    this()
    this.symbol = symbol
    this.date = date
    this.timestamp = timestamp
    this.quantity = quantity
    this.price = price
  }

  def getSymbol: String = symbol

  def setSymbol(symbol: String): Unit = {
    this.symbol = symbol
  }

  def getDate: String = date

  def setDate(date: String): Unit = {
    this.date = date
  }

  def getTimestamp: Long = timestamp

  def setTimestamp(timestamp: Long): Unit = {
    this.timestamp = timestamp
  }

  def getLocalTime: LocalTime = LocalTime.ofNanoOfDay(this.timestamp * 1000000)

  def getQuantity: Int = quantity

  def setQuantity(quantity: Int): Unit = {
    this.quantity = quantity
  }

  def getPrice: Double = price

  def setPrice(price: Double): Unit = {
    this.price = price
  }
}

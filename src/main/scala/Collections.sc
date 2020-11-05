// using sequence

//val members = Seq("Providence", "Innocent", "Humaidu", "Francis")
// List("Providence")
//members.foreach(println(_))
//members.length
//val reversedMembers =  members.reverse
//reversedMembers.foreach(println(_))
//var resultSeq = "Juliet" +: members
// "Juliet" +: members
//resultSeq = resultSeq :+ "Woode"
//resultSeq = resultSeq ++ Seq("Dzifa")
//resultSeq.contains("Dzifa")
//
//def nameFind(value: String): Boolean = value.endsWith("e")
//val find = (value: String) => value.endsWith("e")
//print(find("Woode"))
//nameFind("John")

//resultSeq.count(find)
//resultSeq.count((value: String) => value.endsWith("e"))
//resultSeq.count((value) => value.endsWith("e"))
//resultSeq.count(value => value.endsWith("e"))
//resultSeq.count(_.endsWith("e"))

//"John" compareTo("Ama")
//"Ama" compareTo("John")
//"John" compareTo("John")

//resultSeq.sortWith((s1, s2) => s1.compareTo(s2) < 0)
//resultSeq.sortWith((s1, s2) => s1.compareTo(s2) > 0)
//resultSeq.sortWith(_.compareTo(_) > 0)

//resultSeq.sortBy(s => s.length)
//resultSeq.sortBy(_.length)

//resultSeq.drop(2)
//resultSeq.take(2)

//val students = Seq("Providence", "Innocent", "Humaidu", "Francis")
//val ignore = Seq("Providence", "Innocent")
//
//val result = for (s <- students; i <- ignore) yield  s != i
//result.foreach(println(_))

val students = Seq("Providence", "Innocent", "Humaidu", "Francis") //4

/**
 * Removing an element in a collection
 */
def remove(col: Seq[Any], index: Int): Seq[Any] = {
  // return the collection if index is out of range
  if (index >= col.length || index < 0) return col
  //slicing the collection to get the element to remove
  val droppedList = col.slice(index, index + 1)
  //get the element of the dropped list
  val droppedElement = droppedList.head
  //filter the original collection and return all elements that are not
  //the same as the dropped element
  col.filterNot(_.equals(droppedElement))
}


remove(students, 0)
remove(students, 1)
remove(students, 2)
remove(students, -5)
remove(students, 10)

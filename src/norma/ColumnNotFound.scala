package norma

case class ColumnNotFound(columnName: String, possibilities: List[String]) extends SqlRequestError {
  override def toString = columnName + " not found, available columns : " + possibilities.map {
    p => p.dropWhile(c => c == '.')
  }
    .mkString(", ")
}

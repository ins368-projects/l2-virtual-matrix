// 3: Mikhael
fun computeUnidimensionalPosition(row: Int, column: Int, rows: Int, columns: Int): Int {
  val rowsTravel = if(row < rows) row * columns else 0
  val index = if(column < columns) rowsTravel + column else 0
  
  return index
}

// 1: Gabriel.
fun createMatrix(rows: Int, columns: Int): Array<Int> {
  val size: Int = rows * columns;
  val matrix = Array<Int>(size) { 0 };
  return matrix;
}

// 2: Mikhael
fun writeInMatrix(matrix: Array<Int>, rows: Int, columns: Int, row: Int, column: Int, value: Int) {
  val position: Int = computeUnidimensionalPosition(row, column, rows, columns);
  if(position < matrix.size - 1)
    matrix[position] = value;
}

// 4: Gabriel
fun getMatrixValue(matrix: Array<Int>, rows: Int, columns: Int, row: Int, column: Int): Int {
  val position: Int = computeUnidimensionalPosition(row, column, rows, columns);
  return matrix[position];
}

// Set following values to change the size of the "matrix"
const val ROWS: Int = 4;
const val COLUMNS: Int = 4;

fun main() {
  // 5: Gabriel
  val matrix: Array<Int> = createMatrix(ROWS, COLUMNS);

  writeInMatrix(matrix, ROWS, COLUMNS, 3, 3, 5);

  // 6: Mikhael
  val value: Int = getMatrixValue(matrix, ROWS, COLUMNS, 3, 3);

  println(value);
}


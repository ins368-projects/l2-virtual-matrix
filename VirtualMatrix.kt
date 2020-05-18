fun computeUnidimensionalPosition(x: Int, y: Int, rows: Int, columns: Int): Int {
  var position: Int = 0;

  for(i in 0 until rows - 1)
    for(j in 0 until columns - 1) {
      val foundPosition: Boolean = x == i && y == j;
      if(foundPosition)
        return position;

      position++;
    }

  return 0;
}

fun createMatrix(rows: Int, columns: Int): Array<Int> {
  val size: Int = rows * columns;
  val matrix = Array<Int>(size) { 0 };
  return matrix;
}

fun writeInMatrix(matrix: Array<Int>, rows: Int, columns: Int, x: Int, y: Int, value: Int) {
  val position: Int = computeUnidimensionalPosition(x, y, rows, columns);
  if(position < matrix.size - 1)
    matrix[position] = value;
}

fun getMatrixValue(matrix: Array<Int>, rows: Int, columns: Int, x: Int, y: Int): Int {
  val position: Int = computeUnidimensionalPosition(x, y, rows, columns);
  return matrix[position];
}

// Set following values to change the size of the "matrix"
const val ROWS: Int = 4;
const val COLUMNS: Int = 4;

fun main() {
  val matrix: Array<Int> = createMatrix(ROWS, COLUMNS);

  writeInMatrix(matrix, ROWS, COLUMNS, 2, 1, 5);

  val value: Int = getMatrixValue(matrix, ROWS, COLUMNS, 2, 1);

  println(value);
}


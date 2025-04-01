package stage_1.week_1

/*
* Test case scenarios:
* 1. valid
* 2. duplicate in row
* 3. duplicate in column
* 4. duplicate in a subgrid
*/

//sudoku grid possible representations:
//1. list of strings and each string represents a row
//2. list of lists (used)

//drawbacks of the first representation:
//in 16 * 16 grid the needs to numbers that exceeds one digit comes out
//This make it hard to split the string (row) into solo cells

class SudokuCheckerTestCases {
    fun valid9SudokuTestCase() {
        val grid = listOf(
            listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )
    }

    fun duplicateRow9SudokuTestCase() {
        //duplicate 3 in the first row
        val grid = listOf(
            listOf('5', '3', '3', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )
    }

    fun duplicateCol9SudokuTestCase() {

        //duplicate 5 in the first column
        val grid = listOf(
            listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('5', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )
    }

    fun duplicateSubgrid9SudokuTestCase() {
        //duplicate 5 in the subgrid starting im [0,0]
        val grid = listOf(
            listOf('5', '3', '5', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '5', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '5', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )
    }

    fun emptySudokuTestCase() {
        val grid = List(9) { List(9) { '-' } } // Empty Sudoku
    }

    fun valid4SudokuTestCase() {
        val grid = listOf(
            listOf('1', '2', '3', '4'),
            listOf('3', '4', '1', '2'),
            listOf('2', '1', '4', '3'),
            listOf('4', '3', '2', '1')
        )
    }

    fun invalid4SudokuTestCase() {

        //duplicate 3 in the 3rd row
        val grid = listOf(
            listOf('1', '2', '3', '4'),
            listOf('3', '4', '1', '2'),
            listOf('2', '1', '3', '3'),
            listOf('4', '3', '2', '1')
        )
    }

    fun inValid16SudokuTestCase() {
        val grid = List(16) { row -> List(16) { col -> ((row + col) % 16 + 1).asCodeToChar() } }
    }

    fun valid16SudokuTestCase() {
        val grid = listOf(
            listOf('1', '2', '3',  '4',  '5', '6', '7',  '8',  '9', 'A', 'B', 'C',  'D', 'E', 'F', 'G'),
            listOf('5', '6', '7',  '8',  '9', 'A', 'B',  'C',  'D', 'E', 'F', 'G',  '1', '2', '3', '4'),
            listOf('9', 'A', 'B',  'C',  'D', 'E', 'F',  'G',  '1', '2', '3', '4',  '5', '6', '7', '8'),
            listOf('D', 'E', 'F',  'G',  '1', '2', '3',  '4',  '5', '6', '7', '8',  '9', 'A', 'B', 'C'),

            listOf('3', '4', '1',  '2',  '7', '8', '5',  '6',  'B', 'C', '9', 'A',  'F', 'G', 'D', 'E'),
            listOf('7', '8', '5',  '6',  'B', 'C', '9',  'A',  'F', 'G', 'D', 'E',  '3', '4', '1', '2'),
            listOf('B', 'C', '9',  'A',  'F', 'G', 'D',  'E',  '3', '4', '1', '2',  '7', '8', '5', '6'),
            listOf('F', 'G', 'D',  'E',  '3', '4', '1',  '2',  '7', '8', '5', '6',  'B', 'C', '9', 'A'),

            listOf('2', '1', '4',  '3',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
            listOf('6', '5', '8',  '7',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
            listOf('A', '9', 'C',  'B',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
            listOf('E', 'D', 'G',  'F',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),

            listOf('4', '3', '2',  '1',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
            listOf('8', '7', '6',  '5',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
            listOf('C', 'B', 'A',  '9',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
            listOf('G', 'F', 'E',  'D',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-')
        )
    }

    private fun Int.asCodeToChar(): Char = when {
        this < 10 -> this.digitToChar()
        this in 10..16 -> (this+55).toChar()
        else -> '-'
    }
}
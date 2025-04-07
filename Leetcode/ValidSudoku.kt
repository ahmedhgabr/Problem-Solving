// https://leetcode.com/problems/valid-sudoku/description/

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowsRecord = HashSet<String>()
        val colsRecord = HashSet<String>()
        val boxesRecord = HashSet<String>()
        val boxSize = sqrt(board.size.toDouble()).toInt()

        for (row in board.indices) {
            for (col in board[row].indices) {

                val currentChar = board[row][col]
                if (currentChar == '.') continue

                if (rowsRecord.contains("$row$currentChar")) return false
                rowsRecord.add("$row$currentChar")

                if (colsRecord.contains("$col$currentChar")) return false
                colsRecord.add("$col$currentChar")

                val rowBox = row / boxSize
                val colBox = col / boxSize
                if (boxesRecord.contains("$rowBox$colBox$currentChar")) return false
                boxesRecord.add("$rowBox$colBox$currentChar")
            }
        }
        return true
    }
}
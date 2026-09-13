class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public boolean solve(char[][] board, int row, int col) {
        // Move to next row if column ends
        if (col == 9) {
            return solve(board, row + 1, 0);
        }

        // If all rows are filled
        if (row == 9) {
            return true;
        }

        // If cell is already filled, move ahead
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }

        // Try placing numbers 1-9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = (char) ('0' + num);

                if (solve(board, row, col + 1)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, int num) {
        char ch = (char) ('0' + num);

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch) {
                return false;
            }
        }

        // Check column
        for (int j = 0; j < 9; j++) {
            if (board[j][col] == ch) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }
}
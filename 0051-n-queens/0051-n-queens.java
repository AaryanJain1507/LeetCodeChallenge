class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        queens(board, 0, result);
        return result;
    }

    void queens(boolean[][] board, int row, List<List<String>> result){
        if(row == board.length){
            result.add(display(board));
            return;
        }

        for(int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row+1, result);
                board[row][col] = false;
            }
        }
    }

    public boolean isSafe(boolean[][] board, int row, int col){
        //column check
        for(int i = 0; i< row; i++){
            if(board[i][col] == true){
                return false;
            }
        }

        //left Diagonal
        int maxLeft = Math.min(row, col);
        for(int i = 1; i<=maxLeft; i++){
            if(board[row-i][col-i] == true){
                return false;
            }
        }

        //right Diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i<=maxRight; i++){
            if(board[row - i][col + i] == true){
                return false;
            }
        }
        return true;
    }

    public List<String> display(boolean[][] board){
        List<String> res = new ArrayList<>();
        for (int r = 0; r < board.length; r++) {
            StringBuilder row = new StringBuilder();
            for (int c = 0; c < board[0].length; c++) {
                row.append(board[r][c] ? "Q" : ".");
            }
            res.add(row.toString());
        }
        return res;        
    }
}
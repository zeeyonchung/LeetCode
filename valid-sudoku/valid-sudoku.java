class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxs = new boolean[9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = board[i][j];
                
                if (value == '.') {
                    continue;
                }
                
                int num = value - '0' - 1;
                
                if (rows[i][num]) {
                    return false;
                }
                
                if (columns[j][num]) {
                    return false;
                }
                
                int boxIndex = i / 3 * 3 + j / 3;
                    
                if (boxs[boxIndex][num]) {
                    return false;
                }
                
                rows[i][num] = true;
                columns[j][num] = true;
                boxs[boxIndex][num] = true;
            }
        }
        
        return true;
    }
}
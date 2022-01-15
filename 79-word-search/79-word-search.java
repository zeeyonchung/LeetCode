class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exist(board, word, visited, j, i)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean exist(char[][] board, String word, boolean[][] visited, int x, int y) {
        if (word.length() == 0) {
            return true;
        }
        
        char c = word.charAt(0);
        
        if (y < 0 || y >= board.length || 
            x < 0 || x >= board[0].length || 
            visited[y][x] || board[y][x] != c) {
            return false;
        }
        
        visited[y][x] = true;
        String s = word.substring(1);
        
        if (exist(board, s, visited, x - 1, y) ||
            exist(board, s, visited, x + 1, y) ||
            exist(board, s, visited, x, y - 1) ||
            exist(board, s, visited, x, y + 1)) {
            return true;
        }
        
        visited[y][x] = false;
        return false;
    }
}
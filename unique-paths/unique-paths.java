class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        grid[0][0] = 1;
        
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (x == 0 && y == 0) {
                    continue;
                }
                
                int sum = 0;
                
                if (y > 0) {
                    sum += grid[y - 1][x];
                }
                
                if (x > 0) {
                    sum += grid[y][x - 1];
                }
                
                grid[y][x] = sum;
            }
        }
        
        return grid[m - 1][n - 1];
    }
}
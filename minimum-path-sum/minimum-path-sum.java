class Solution {
    public int minPathSum(int[][] grid) {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (x > 0 && y > 0) {
                    grid[y][x] += Math.min(grid[y][x - 1], grid[y - 1][x]);
                    continue;
                }
                
                if (x > 0) {
                    grid[y][x] += grid[y][x - 1];
                    continue;
                }
                
                if (y > 0) {
                    grid[y][x] += grid[y - 1][x];
                }
            }
        }
        
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
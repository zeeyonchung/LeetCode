class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int minSum = 0;
        
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                int min = 0;
                
                if (y > 0) {
                    min = matrix[y - 1][x];
                }
                
                if (y > 0 && x > 0) {
                    min = Math.min(min, matrix[y - 1][x - 1]); 
                }
                
                if (y > 0 && x < matrix[0].length - 1) {
                    min = Math.min(min, matrix[y - 1][x + 1]);
                }
                
                matrix[y][x] += min;
                
                if (x == 0) {
                    minSum = matrix[y][x];
                }
                
                if (matrix[y][x] < minSum) {
                    minSum = matrix[y][x];
                }
            }
        }
        
        return minSum;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] zeroY = new boolean[matrix.length];
        boolean[] zeroX = new boolean[matrix[0].length];
        
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                if (matrix[y][x] == 0) {
                    zeroX[x] = true;
                    zeroY[y] = true;
                }
            }
        }
        
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                if (zeroX[x] || zeroY[y]) {
                    matrix[y][x] = 0;
                }
            }
        }
    }
}
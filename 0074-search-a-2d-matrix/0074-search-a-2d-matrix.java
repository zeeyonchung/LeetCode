class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int y = 0; y < matrix.length; y++) {
            if (target > matrix[y][matrix[y].length - 1]) {
                continue;
            }

            for (int x = 0; x < matrix[y].length; x++) {
                if (target == matrix[y][x]) {
                    return true;
                }
            }
        }

        return false;
    }
}
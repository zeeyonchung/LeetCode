class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                if (target == matrix[j][i]) {
                    return true;
                }
                
                if (target < matrix[j][i]) {
                    break;
                }
            }
        }
        
        return false;
    }
}
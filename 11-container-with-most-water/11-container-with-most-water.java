class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        
        for (int i = 0; i < height.length; i++) {
            if (height[i] < left) {
                continue;
            }
            
            left = height[i];
            
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(left, height[j]) * (j - i);
                max = Math.max(area, max);
            }
        }
        
        return max;
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (true) {
            if (start == end) {
                return nums[start];
            }
            
            int i = (start + end) / 2;
            boolean odd = (end - i) % 2 != 0;
            
            if (nums[i] == nums[i - 1]) {
                if (odd) {
                    start = i + 1;
                } else {
                    end = i;
                }
                
                continue;
            }
            
            if (nums[i] == nums[i + 1]) {
                if (odd) {
                    end = i - 1;
                } else {
                    start = i;
                }
                
                continue;
            }
            
            return nums[i];
        }
    }
}
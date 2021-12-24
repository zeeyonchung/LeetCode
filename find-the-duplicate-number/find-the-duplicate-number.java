class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            
            if (count[n - 1] == 1) {
                return n;
            }
            
            if (count[n - 1] == 0) {
                count[n - 1] = 1;
            }
        }
        
        return -1;
    }
}
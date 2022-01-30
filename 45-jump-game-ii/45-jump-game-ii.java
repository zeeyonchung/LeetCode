class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int preEnd = 0;
        int preFar = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (preFar < nums[i] + i) {
                preFar = nums[i] + i;
            }
            
            if (preEnd == i) {
                preEnd = preFar;
                jumps++;
            }
        }
        
        return jumps;
    }
}
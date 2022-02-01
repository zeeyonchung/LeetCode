class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, target, 0, 0);
    }
    
    private int findTargetSumWays(int[] nums, int target, int curr, int i) {
        if (i == nums.length) {
            return curr == target ? 1 : 0;
        }
        
        int a = findTargetSumWays(nums, target, curr + nums[i], i + 1);
        int b = findTargetSumWays(nums, target, curr - nums[i], i + 1);
        
        return a + b;
    }
}
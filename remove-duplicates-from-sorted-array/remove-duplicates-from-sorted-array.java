class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        
        int count = 1;
        int lastNum = nums[0];
        int lastIndex = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != lastNum) {
                nums[lastIndex++ + 1] = nums[i];
                lastNum = nums[lastIndex];
                count++;
            }
        }
        
        return count;
    }
}
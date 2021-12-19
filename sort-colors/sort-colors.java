class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        
        for (int num : nums) {
            counts[num] += 1;
        }
        
        int preCount = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < counts[i]; j++) {
                nums[j + preCount] = i;
            }
            
            preCount += counts[i];
        }
    }
}
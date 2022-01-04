class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        
        if (first == -1) {
            return new int[] {-1, -1};
        }
        
        int last = findLast(nums, target, first);
        
        return new int[] {first, last};
    }
    
    private int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (true) {
            if (start > end) {
                return -1;
            }
            
            int i = (start + end) / 2;
            
            if (nums[i] > target) {
                end = i - 1;
            }
            else if (nums[i] < target) {
                start = i + 1;
            }
            else if (i != 0 && nums[i - 1] == target) {
                end--;
            }
            else {
                return i;
            }
        }
    }
    
    private int findLast(int[] nums, int target, int first) {
        int start = first;
        int end = nums.length - 1;
        
        while (true) {
            int i = (start + end) / 2;
            
            if (nums[i] != target) {
                end = i - 1;
            }
            else if (i != nums.length - 1 && nums[i + 1] == target) {
                start = i + 1;
            }
            else {
                return i;
            }
        }
    }
}
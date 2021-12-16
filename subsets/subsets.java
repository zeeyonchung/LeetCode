class Solution {
    private List<List<Integer>> result = null;
    private int[] nums = null;
    
    public List<List<Integer>> subsets(int[] nums) {
        this.result = new ArrayList<>();
        this.nums = nums;
        
        subsets(new ArrayList<Integer>(), 0);
        
        return result;
    }
    
    private void subsets(List<Integer> prev, int start) {
        result.add(prev);
        
        for (int i = start; i < nums.length; i++) {
            List<Integer> l = new ArrayList<>();
            l.addAll(prev);
            l.add(nums[i]);
            subsets(l, i + 1);
        }
    }
}
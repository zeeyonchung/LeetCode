/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(0, nums.length - 1, nums);
    }
    
    private TreeNode constructMaximumBinaryTree(int s, int e, int[] nums) {
        if (s > e) {
            return null;
        }
        
        int max = nums[s];
        int maxIndex = s;
        
        for (int i = s + 1; i <= e; i++) {
            if (nums[i] < max) {
                continue;
            }
            
            max = nums[i];
            maxIndex = i;
        }
        
        TreeNode left = constructMaximumBinaryTree(s, maxIndex - 1, nums);
        TreeNode right = constructMaximumBinaryTree(maxIndex + 1, e, nums);
        
        return new TreeNode(max, left, right);
    }
}
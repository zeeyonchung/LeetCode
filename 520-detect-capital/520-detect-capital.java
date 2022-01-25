class Solution {
    public boolean detectCapitalUse(String word) {
        boolean pre = Character.isUpperCase(word.charAt(0));
        
        for (int i = 1; i < word.length(); i++) {
            boolean curr = Character.isUpperCase(word.charAt(i));
            
            if (curr == pre) {
                continue;
            }
            
            if (i != 1 || curr) {
                return false;
            }
            
            pre = curr;
        }
        
        return true;
    }
}
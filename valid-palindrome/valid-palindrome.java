class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int front = 0;
        int back = s.length() - 1;
        
        while (front < back) {
            if (!Character.isLetterOrDigit(s.charAt(front))) {
                front++;
                continue;
            }
            
            if (!Character.isLetterOrDigit(s.charAt(back))) {
                back--;
                continue;
            }
            
            if (s.charAt(front) != s.charAt(back)) {
                return false;
            }
            
            front++;
            back--;
        }
        
        return true;
    }
}
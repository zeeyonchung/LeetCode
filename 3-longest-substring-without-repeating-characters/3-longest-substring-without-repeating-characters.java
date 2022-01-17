class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            set.add(s.charAt(i));
            
            for (int j = i + 1; j < length; j++) {
                char c = s.charAt(j);
                
                if (set.contains(c)) {
                    break;
                }
                
                set.add(c);
            }
            
            max = Math.max(max, set.size());
            set.clear();
        }
        
        return max;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int count = 0;
        Set<Character> set = new HashSet<>();
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            set.add(s.charAt(i));
            count++;
            
            for (int j = i + 1; j < length; j++) {
                char c = s.charAt(j);
                
                if (set.contains(c)) {
                    break;
                }
                
                count++;
                set.add(c);
            }
            
            if (count > max) {
                max = count;
            }
            
            count = 0;
            set.clear();
        }
        
        return max;
    }
}
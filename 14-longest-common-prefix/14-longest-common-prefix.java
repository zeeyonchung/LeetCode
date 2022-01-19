class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].indexOf(prefix) == 0) {
                continue;
            }

            for (int j = 0; j < prefix.length(); j++) {
                if (strs[i].length() < j + 1 || prefix.charAt(j) != strs[i].charAt(j)) {
                    prefix = prefix.substring(0, j);
                }
            }
        }
        
        return prefix;
    }
}
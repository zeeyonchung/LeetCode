class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, wordDict, new boolean[s.length() + 1]);
    }
    
    private boolean wordBreak(String s, List<String> wordDict, boolean[] visited) {
        if (s.isEmpty()) {
            return true;
        }
        
        if (visited[s.length()]) {
            return false;
        }
        
        visited[s.length()] = true;
        
        for (String w : wordDict) {
            if (!s.startsWith(w)) {
                continue;
            }
            
            if (wordBreak(s.substring(w.length()), wordDict, visited)) {
                return true;
            }
        }
        
        return false;
    }
}
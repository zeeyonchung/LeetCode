class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        result.add("");
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int size = result.size();
            
            for (int j = 0; j < size; j++) {
                String pre = result.get(j);
                
                if (Character.isDigit(c)) {
                    result.set(j, pre + c);
                    continue;
                }
                
                result.set(j, pre + Character.toUpperCase(c));
                result.add(pre + Character.toLowerCase(c));
            }
        }
        
        return result;
    }
}
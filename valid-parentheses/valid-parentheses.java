class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            
            if (!map.containsKey(c)) {
                stack.push(c);
                continue;
            }
            
            if (stack.empty() || stack.pop() != map.get(c)) {
                return false;
            }
        }
        
        return stack.empty();
    }
}
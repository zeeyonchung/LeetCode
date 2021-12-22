class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
        
        int result = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            int num = symbols.get(s.charAt(i));
            int nextNum = i != length - 1 ? symbols.get(s.charAt(i + 1)) : 0;
            
            if (num >= nextNum) {
                result += num;
                continue;
            }
            
            result += nextNum - num;
            i++;
        }
        
        return result;
    }
}
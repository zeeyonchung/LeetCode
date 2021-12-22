class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        if (n <= 0) {
            return result;
        }
        
        return generateNext(n, n, "");
    }
    
    private List<String> generateNext(int open, int close, String temp) {
        List<String> result = new ArrayList<>();
        
        if (open == 0 && close == 0) {
            result.add(temp);
        } 
        
        if (open > 0) {
            List<String> next = generateNext(open - 1, close, temp + "(");
            result.addAll(next);
        }
        
        if (close > 0 && open < close) {
            List<String> next = generateNext(open, close - 1, temp + ")");
            result.addAll(next);
        }
        
        return result;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length - 1; i++) {
            result[i] = warmerDay(temperatures, i);
        }
        
        return result;
    }
    
    private int warmerDay(int[] temperatures, int start) {
        for (int j = start + 1; j < temperatures.length; j++) {
            if (temperatures[start] < temperatures[j]) {
                return j - start;
            }
        }
        
        return 0;
    }
}
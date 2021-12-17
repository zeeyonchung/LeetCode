class Solution {
    public int reverse(int x) {
        long result = 0;
        int sign = x > 0 ? 1 : -1;
        x *= sign;
        
        while (x > 0) {
            result *= 10;
            result += (x % 10);            
            x /= 10;
        }
        
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) result * sign;
    }
}
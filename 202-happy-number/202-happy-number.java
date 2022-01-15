class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while (true) {
            if (set.contains(n)) {
                return false;
            }
            
            set.add(n);
            int k = 0;
            
            while (n > 0) {
                k += (n % 10) * (n % 10);
                n /= 10;
            }
            
            if (k == 1) {
                return true;
            }
            
            n = k;
        }
    }
}
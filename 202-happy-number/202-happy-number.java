class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int k = 0, r = 0;
        
        while (true) {
            if (set.contains(n)) {
                return false;
            }
            
            set.add(n);
            k = 0;
            
            while (n > 0) {
                r = n % 10;
                k += r * r;
                n /= 10;
            }
            
            if (k == 1) {
                return true;
            }
            
            n = k;
        }
    }
}
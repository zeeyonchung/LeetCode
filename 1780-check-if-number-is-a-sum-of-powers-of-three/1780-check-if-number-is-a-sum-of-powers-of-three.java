class Solution {
    public boolean checkPowersOfThree(int n) {
        return checkPowersOfThree((double) n, 1);
    }
    
    private boolean checkPowersOfThree(double n, int i) {
        if (n == 0 || n == 1) {
            return true;
        }
        
        double temp = n;
        
        while (temp >= 3) {
            temp = n - Math.pow(3, i++);
            
            if (checkPowersOfThree(temp, i)) {
                return true;
            }
        }
        
        return false;
    }
}
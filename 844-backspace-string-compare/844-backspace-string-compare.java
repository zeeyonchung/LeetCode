class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sIndex = s.length() - 1, tIndex = t.length() - 1;
        int sBack = 0, tBack = 0;
        
        while (sIndex >= 0 || tIndex >= 0) {
            char sc = '*';
            
            if (sIndex >= 0) {
                sc = s.charAt(sIndex);
                
                if (sc == '#') {
                    sIndex--;
                    sBack++;
                    continue;
                }

                if (sBack > 0) {
                    sIndex--;
                    sBack--;
                    continue;
                }
            }
            
            char tc = '*';
            
            if (tIndex >= 0) {
                tc = t.charAt(tIndex);
                
                if (tc == '#') {
                    tIndex--;
                    tBack++;
                    continue;
                }

                if (tBack > 0) {
                    tIndex--;
                    tBack--;
                    continue;
                }
            }
            
            if (sc != tc) {
                return false;
            }
            
            sIndex--;
            tIndex--;
            sBack = 0;
            tBack = 0;
        }
        
        return true;
    }
}
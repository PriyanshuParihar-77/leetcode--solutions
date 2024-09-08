class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        if (m == 0) return true;
        int indexS = 0, indexT = 0;
        
        while (indexT < n) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
                if (indexS == m) return true;
            }
            indexT++;
        }
        return false;
    }
}

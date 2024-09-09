class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length(), val = 0;
        for (int i = 0; i < n; i++) {
            val += Math.pow(26, n - 1 - i) * (columnTitle.charAt(i) - 'A' + 1);
        }
        return val;
    }
}

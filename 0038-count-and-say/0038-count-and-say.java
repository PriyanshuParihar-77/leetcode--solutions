class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String s = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder res = new StringBuilder();
            int counter = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    counter++;
                } else {
                    res.append(counter).append(s.charAt(j - 1));
                    counter = 1;
                }
            }
            res.append(counter).append(s.charAt(s.length() - 1));
            s = res.toString();
        }
        return s;
    }
}

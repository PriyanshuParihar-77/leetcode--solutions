class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(bannedWords));
        int count = 0;
        for (String word : message) {
            if (bannedSet.contains(word)) {
                count++;
                if (count == 2) return true;
            }
        }
        return false;
    }
}

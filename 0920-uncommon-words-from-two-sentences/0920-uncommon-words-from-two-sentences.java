import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Helper function to count words
        countWords(s1, wordCount);
        countWords(s2, wordCount);
        
        List<String> result = new ArrayList<>();
        
        // Collect words that appear exactly once
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        // Convert the list to an array
        return result.toArray(new String[0]);
    }
    
    private void countWords(String sentence, Map<String, Integer> wordCount) {
        for (String word : sentence.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }
}

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numToIndex.containsKey(complement)) {
                // Return the indices of the complement and the current number
                return new int[]{numToIndex.get(complement), i};
            }
            
            // Add the current number and its index to the map
            numToIndex.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution exists for the given input.");
    }
}

import java.util.HashMap;

class Solution { 
    public int subarraySum(int[] nums, int k) { 
        // Key: cumulative prefix sum, Value: frequency of that sum
        HashMap<Integer, Integer> hs = new HashMap<>(); 
        
        // Base case: handling subarrays that start from index 0
        hs.put(0, 1); 
        
        int sum = 0; 
        int count = 0; 
        
        for (int i = 0; i < nums.length; i++) { 
            sum += nums[i]; 
            
            // If (sum - k) exists in the map, it means a valid subarray ends here
            if (hs.containsKey(sum - k)) {
                count += hs.get(sum - k); 
            } 
            
            // Record the current prefix sum in the map
            hs.put(sum, hs.getOrDefault(sum, 0) + 1); 
        } 
        
        return count; 
    } 
}

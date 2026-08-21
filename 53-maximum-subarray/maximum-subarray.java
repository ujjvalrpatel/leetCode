class Solution {

    public int maxSubArray(int[] nums) {

        int min = 0;          // smallest prefix sum seen so far
        int prefix = 0;       // current prefix sum
        int max = nums[0];    // maximum subarray sum

        for (int i = 0; i < nums.length; i++) {

            prefix += nums[i];

            max = Math.max(max, prefix - min);

            min = Math.min(min, prefix);
        }

        return max;
    }
}
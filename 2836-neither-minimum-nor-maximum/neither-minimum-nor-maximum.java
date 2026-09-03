class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==1||nums.length==2)
        return -1;
        return Math.max(Math.min(nums[0],nums[1]),Math.max(Math.min(nums[0],nums[2]),Math.min(nums[2],nums[1])));
    }
}
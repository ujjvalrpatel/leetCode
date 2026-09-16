class Solution {
    public int searchInsert(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
                }

            else low=mid+1;
        }
        return ans;
    }
}
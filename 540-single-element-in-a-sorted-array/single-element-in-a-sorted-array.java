class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(mid==high||mid==low){
                return nums[mid];
            }
             else if(nums[mid]==nums[mid+1]){
                if((high-mid-1)%2!=0){
                    low=mid+2;
                }
                else{
                    high=mid-1;
                }
            }
            else if(nums[mid]==nums[mid-1]){
                if((high-mid)%2!=0){
                    low=mid+1;
                }
                else{
                    high=mid-2;
                }
            }
            else{
                return  nums[mid];
            }

        }
        return -1;
    }
}
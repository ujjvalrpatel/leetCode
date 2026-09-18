class Solution {
    public int search(int[] nums, int target) {
          if(nums[0]<=nums[nums.length-1]){
            int low=0;
            int high=nums.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target)
                return mid;
                else if(nums[mid]>target)
                high=mid-1;
                else{
                    low=mid+1;
                }
            }
            return -1;
          }

            int low=0;
            int high=nums.length-1;
            int a=-1;
            while(low<=high){
                int mid=(low+high)/2;
                
                if(nums[mid]<nums[0]){
                    a=mid;
                    high=mid-1;
                }
                
                else if(nums[mid]>=nums[0])
                low=mid+1;
            }
            if(target<nums[0]){
                high=nums.length-1;
                low=a;
            }
            else{
                low=0;
                high=a-1;
            }
            
             while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target)
                return mid;
                else if(nums[mid]>target)
                high=mid-1;
                else{
                    low=mid+1;
                }
            }
            return -1;
          
    }
}
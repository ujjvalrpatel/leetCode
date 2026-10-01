class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max)max=nums[i];
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=Math.ceil(nums[i]*1.0/mid);
            }
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{low=mid+1;}
            
        }
        return ans;
    }
}
class Solution {
    public int splitArray(int[] nums, int k) {

        int max=nums[0];
        int sum=0;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int count=0;
            int mid=low+(high-low)/2;
            int tempSum=0;
            for(int i=0;i<nums.length;i++){
                if(tempSum+nums[i]<=mid )
                tempSum+=nums[i];
                else{
                    count++;
                    tempSum=nums[i];
                }
            }
            count++;
            if(count<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
}
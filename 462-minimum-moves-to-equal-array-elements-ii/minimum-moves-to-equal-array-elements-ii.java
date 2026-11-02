class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        if(nums.length%2==1){
            int n=nums[(nums.length+1)/2-1];
            int ans=0;
            for(int i=0;i<nums.length;i++){
                ans+=Math.abs(n-nums[i]);
            }
            return ans;
        }
        else{
            int n=Math.round((nums[(nums.length)/2-1]+nums[(nums.length)/2])/2);
            int ans=0;
            for(int i=0;i<nums.length;i++){
                ans+=Math.abs(n-nums[i]);
            }
            return ans;
        }
        
    }
}
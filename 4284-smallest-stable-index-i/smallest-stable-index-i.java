class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min=new int[nums.length];
        int m=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            m=Math.min(nums[i],m);
            min[i]=m;
        }
        m=nums[0];
        for(int i=0;i<nums.length;i++){
            m=Math.max(m,nums[i]);
            if(m-min[i]<=k)
            return i;
        }
        return -1;
    }
}
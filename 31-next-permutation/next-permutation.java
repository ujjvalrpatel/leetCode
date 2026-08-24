class Solution {
    public void nextPermutation(int[] nums) {
         if(nums.length==1)
        return;
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
                
            }
        }
        if(ind==-1){
            int s=0;
            int e=nums.length-1;
            while(s<e){
                int temp=nums[e];
                nums[e]=nums[s];
                nums[s]=temp;s++;e--;
            }
            return ;
        }
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;;
                break;
            }
        }
        int s=ind+1;
        int e=nums.length-1;
        while(s<e){
                int temp=nums[e];
                nums[e]=nums[s];
                nums[s]=temp;s++;e--;
            }
            return ;
    }
}
class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1)
        return 1;
        int minindex=0;
        int max=nums[0];
        int min=nums[0];
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minindex=i;
            }
            else if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
        }
        int a=(int)Math.max(maxindex,minindex)+1;
        int b=(int)Math.max(nums.length-maxindex,nums.length-minindex);
        int c=(int)(Math.min(minindex+1,nums.length-minindex))+(int)(Math.min(maxindex+1,nums.length-maxindex));
        return (int)Math.min(a,Math.min(b,c));

    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        if(nums2.length==0||nums1.length==0)return;
        int p=nums1.length-1-n;
        int k=nums2.length-1;
        for(int i=nums1.length-1;i>=0;i--){
            if(k<0)
            return;
            if(p<0){
                for (int j=i;j>=0;j--){
                    nums1[j]=nums2[k];
                    k--;
                }
                return;
            }
            if(nums2[k]>=nums1[p]){
            nums1[i]=nums2[k];
            k--;
            }
            else {
                nums1[i]=nums1[p];
                p--;
            }
           
            
        }
    }
}
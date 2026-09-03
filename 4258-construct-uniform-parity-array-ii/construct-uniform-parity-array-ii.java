class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=0;
        int minEven=0;
        boolean oddcheck=false;
        boolean evencheck=false;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==1)
            return true;
            if(!oddcheck &&nums1[i]%2!=0){
                minOdd=nums1[i];
                oddcheck=true;
            }
            if(!evencheck &&nums1[i]%2==0){
                minEven=nums1[i];
                evencheck=true;
            }
            if(oddcheck &&nums1[i]%2!=0){
                minOdd=Math.min(minOdd,nums1[i]);
            }
            if(evencheck &&nums1[i]%2==0){
                minEven=Math.min(nums1[i],minEven);
                
            }

        }
        if(minEven==0||minOdd==0){
            return true;
        }
        if(minEven>minOdd){
            return true;
        }
        return false;

    }
}
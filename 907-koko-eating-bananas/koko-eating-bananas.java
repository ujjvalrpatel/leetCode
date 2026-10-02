class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            
            max=Math.max(max,piles[i]);
        }
        int ans=0;
        while(min<=max){
            int sum=0;
            int mid=min+(max-min)/2;
            for(int i=0;i<piles.length;i++){
                sum+=Math.ceil(piles[i]*1.0/mid);
            }
            if(sum<=h){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;

    }
}
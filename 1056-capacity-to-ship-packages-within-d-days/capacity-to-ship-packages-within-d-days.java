class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int h=0;
        for (int i=0;i<weights.length;i++){
            h+=weights[i];
        max=Math.max(max,weights[i]);}
        int l=max;
        
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            int s=0;
            int d=1;
            for(int i=0;i<weights.length;i++){
                if (s + weights[i] > mid) {
                    d++;
                    s = weights[i];
                } else {
                    s += weights[i];
                }

            }
            if(d<=days){
                h=mid-1;
                ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
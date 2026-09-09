class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt2=0;
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(cnt1==0&&nums[i]!=ele2){
                cnt1++;
                ele1=nums[i];
            }
            else if(cnt2==0&&nums[i]!=ele1){
                cnt2++;
                ele2=nums[i];
            }
            else if(ele1==nums[i]){
                cnt1++;
            }
            else if(ele2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }cnt1=0;cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i])cnt1++;
            if(ele2==nums[i])cnt2++;
        }
        int min=(int)nums.length/3+1;
        if(cnt1>=min)a.add(ele1);
        if(cnt2>=min)a.add(ele2);

        return a;
    }
}
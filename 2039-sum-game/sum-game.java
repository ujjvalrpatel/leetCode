class Solution {
    public boolean sumGame(String num) {
        int lsum=0;
        int rsum=0;
        int lq=0;
        int rq=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?')
            lq++;
            else
            lsum+=((int)(num.charAt(i)-'0'));
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?')
            rq++;
            else
            rsum+=((int)(num.charAt(i)-'0'));
        }
        int q=rq-lq;
        int sum=rsum-lsum;
        if(q*sum>0)
        return true;
        if(q*9==-sum*2)
        return false;
        return true;
    }
}
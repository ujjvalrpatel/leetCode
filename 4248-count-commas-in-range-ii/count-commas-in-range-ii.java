class Solution {
    public long countCommas(long n) {
        long sum=0;
        int pow=3;
        while(true){
            long p=n-(long)(Math.pow(10,pow))+1;
            if(p<=0)
            return sum;
            sum+=p;
            pow+=3;
        }
    }
}
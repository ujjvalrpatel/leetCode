class Solution {
    public int romanToInt(String s) {
        int lval=0;
        int val=0;
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='I')val=1;
            if(s.charAt(i)=='V')val=5;
            if(s.charAt(i)=='X')val=10;
            if(s.charAt(i)=='L')val=50;
            if(s.charAt(i)=='C')val=100;
            if(s.charAt(i)=='D')val=500;
            if(s.charAt(i)=='M')val=1000;
            if(val>=lval)sum+=val;
            else{sum-=val;}
            lval=val;
        }
        return sum;
    }
}
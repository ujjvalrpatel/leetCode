class Solution {
    public int calculateScore(int a, int b) {
        int c=0;
        int d=0;
        while(a!=0){
            c+=(a%2);
            a/=2;
        }
        while(b!=0){
            d+=(b%2);
            b/=2;
        }
        if(c>=d)return c*d;
        return (int)d/c;
    }
}
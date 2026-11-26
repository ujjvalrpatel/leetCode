class Solution {
    public int myAtoi(String s) {
        
        long val=0;
        int length=s.length();
        int i=0;
        while(i<length && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<length &&s.charAt(i)=='-'){
            i++;sign=-1;
        }
        else if(i<length &&s.charAt(i)=='+'){
            i++;sign=1;
        }
        while(i<length &&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            val=((val*10)+(s.charAt(i)-'0'));
            long sval=val*sign;
        if(sval>=Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(sval<=Integer.MIN_VALUE)return Integer.MIN_VALUE;
        i++;
        }
        val=val*sign;
        
        return (int)val;
    }
}
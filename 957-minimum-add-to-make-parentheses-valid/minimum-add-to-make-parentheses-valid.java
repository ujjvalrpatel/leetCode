class Solution {
    public int minAddToMakeValid(String s) {
        int a=0;
        int b=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')a++;
            else if(a==0){
                ans++;
            }
            else a--;

            
        }
        return ans+a;
    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer sb=new StringBuffer(s);
        int a=0;
        for(int i=0;i<sb.length();i++){
           
            if(sb.charAt(i)=='('){
                if(a==0){
                sb.deleteCharAt(i);
                i--;
            }
                a++;

            }
            else{
                a--;
                if(a==0){
                sb.deleteCharAt(i);
                i--;
            }
            }
        }
        return sb.toString();
    }
}
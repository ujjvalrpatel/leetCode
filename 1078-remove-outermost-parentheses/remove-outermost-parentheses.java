class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer sb=new StringBuffer();
        int a=0;
        for(int i=0;i<s.length();i++){
           
            if(s.charAt(i)=='('){
                if(!(a==0)){
                
            sb.append(s.charAt(i));}
                a++;

            }
            else{
                a--;
                if(!(a==0)){
                sb.append(s.charAt(i));
                
            }
            }
        }
        return sb.toString();
    }
}
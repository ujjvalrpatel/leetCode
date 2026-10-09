class Solution {
    public int minInsertions(String s) {
        int ans=0;
        Stack<String> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push("(");
            }
            else if(s.charAt(i)==')'){
                if(i==s.length()-1)
                {
                ans++;
                
                }
                else if(s.charAt(i+1)!=')'){
                    ans++;
                    
                }
                else{
                    i++;
                    
                }
                if(!st.isEmpty())
                st.pop();
                else
                ans++;
            }


        }

        return ans+2*st.size();
    }
}
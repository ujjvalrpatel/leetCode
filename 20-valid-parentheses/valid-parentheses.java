import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Deque<Character> s1=new ArrayDeque<>();
        int a=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
            s1.push(s.charAt(i));a++;}
            else if(a>0&&(
                (s.charAt(i)==')'&&s1.peek()=='(')||
            (s.charAt(i)==']'&&s1.peek()=='[')||
            (s.charAt(i)=='}'&&s1.peek()=='{'))) {
                s1.pop();a--;
            }
            else{
                return false;
            }

        }

        return s1.isEmpty();
        
    }
}
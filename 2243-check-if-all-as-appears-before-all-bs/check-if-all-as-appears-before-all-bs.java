class Solution {
    public boolean checkString(String s) {
        int low=0;
        int high=s.length()-1;
        boolean c=true;
        while(low<=high){
            if(s.charAt(low)=='a'&&s.charAt(high)=='b'){
                low++;
                high--;
            }
            else if(s.charAt(low)==s.charAt(high)){
                char a=s.charAt(low);
                while(low<=high){
                    if(s.charAt(low)!=a||s.charAt(high)!=a){
                        return false;
                    }
                    low++;
                    high--;
                }

            }
            else return false;
            
        }
        return c;
    }
}
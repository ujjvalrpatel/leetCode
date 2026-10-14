class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int n=sum/9;
        int k=sum%9;
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            sb.append("9");
            n--;
        }
        if(k!=0){
        sb.append(k);}
        if(sb.length()>num){
            return "";
        }
        while(sb.length()<num){
            sb.append("0");
        }
        return new String(sb);
    }
}
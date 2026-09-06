class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> num=new ArrayList<>();
        int rs=0;
            int rl=matrix.length-1;
            int cs=0;
            int cl=matrix[0].length-1;
            while(rs<=rl&&cs<=cl){
            
            for(int i=cs;i<=cl;i++){
                num.add(matrix[rs][i]);
            }
            for(int i=rs+1;i<=rl;i++){
                num.add(matrix[i][cl]);
            }
            if(rs<rl){
            for(int i=cl-1;i>=cs;i--){
                num.add(matrix[rl][i]);
            }}
            if(cs<cl){
            for(int i=rl-1;i>rs;i--){
                num.add(matrix[i][cs]);
            }}
            rs++;cs++;rl--;cl--;



        }
        return num;
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> r1=new ArrayList<>();
        r1.add(1);
        a.add(r1);
        if(numRows==1)
        return a;
        List<Integer> r2=new ArrayList<>();
        r2.add(1);
        r2.add(1);
        a.add(r2);
        if(numRows==2)
        return a;
        for(int i=1;i<=numRows-2;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<=i;j++){
                l.add(a.get(i).get(j-1)+a.get(i).get(j));
            }
            l.add(1);
            a.add(l);
        }
        return a;


    }
}
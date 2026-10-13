class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        
        // Sort squares in ascending order
        java.util.Arrays.sort(squares);
        
        long ans = 0;
        int s = 0, l = n - 1;
        boolean add = true;
        
        // Pick largest elements alternately from the end (largest squares) and start
        while (s <= l) {
            if (add) {
                ans += squares[l];
                l--;
            } else {
                ans -= squares[s];
                s++;
            }
            add = !add;
        }
        return ans;
    }
}

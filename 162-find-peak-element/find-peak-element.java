class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        // Standard binary search loop
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than the next element,
            // the peak lies in the left half (including mid)
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } 
            // If mid element is smaller than the next element,
            // the peak lies strictly in the right half
            else {
                left = mid + 1;
            }
        }
        
        // When left == right, they point to a peak element
        return left;
    }
}

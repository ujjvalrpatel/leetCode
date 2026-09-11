class Solution {
    public int totalNumbers(int[] digits) {
       
        int[] availableCounts = new int[10];
        for (int d : digits) {
            availableCounts[d]++;
        }
        
        int uniqueEvenCount = 0;
        
       
        for (int num = 100; num < 1000; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;
            
            int[] neededCounts = new int[10];
            neededCounts[hundreds]++;
            neededCounts[tens]++;
            neededCounts[units]++;
            
            if (availableCounts[hundreds] >= neededCounts[hundreds] &&
                availableCounts[tens] >= neededCounts[tens] &&
                availableCounts[units] >= neededCounts[units]) {
                uniqueEvenCount++;
            }
        }
        
        return uniqueEvenCount;
    }
}

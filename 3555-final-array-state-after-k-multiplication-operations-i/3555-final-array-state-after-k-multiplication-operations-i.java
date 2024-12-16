class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int min = Integer.MAX_VALUE; // Initialize to maximum value
            int minIndex = -1; // Initialize to invalid index
            
            // Find the minimum value and its index
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    minIndex = i;
                }
            }
            
            // Update the minimum element using the multiplier
            if (minIndex != -1) {
                nums[minIndex] = min * multiplier;
            }
            
            k--; // Decrement the counter
        }
        
        return nums;
    }
}

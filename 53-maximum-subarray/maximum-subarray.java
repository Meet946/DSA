class Solution {
    public int maxSubArray(int[] nums) {
        // Track the maximum sum found so far
        int maxSoFar = nums[0];
        // Track the sum of the current subarray
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current element to the existing streak,
            // or throw away the past and start fresh with nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the overall maximum if the current streak is better
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        
        return maxSoFar;
    }
}
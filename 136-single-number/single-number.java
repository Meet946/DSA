class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        // for each loop to compute XOR for all elements 
        // at last we get single element bcoz other appears twice so 2^2 = 0 & num ^ 0 = num
        for(int num: nums){
            result ^= num;
        }

        return result;
    }
}
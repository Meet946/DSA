class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    static int atMost(int[] nums, int goal){
        int l = 0, sum = 0, res = 0;

        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum > goal && l <= r){
                sum -= nums[l];
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}
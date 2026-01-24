class Solution {
    public int minPairSum(int[] nums) {
        // first sort the array
        Arrays.sort(nums);

        int pair_sum = 0, max_sum = 0 ;
        int left= 0, right = nums.length - 1;

        // generate pair_sum and compute max_sum by using sorted array and two pointers
        while(left < right){
            pair_sum = nums[left] + nums[right];
            left++;
            right--;
            if(max_sum < pair_sum){
                max_sum = pair_sum;
            }
        }
        return max_sum;
    }
}
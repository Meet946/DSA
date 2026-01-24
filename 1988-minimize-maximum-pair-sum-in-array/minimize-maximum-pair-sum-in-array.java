class Solution {
    public int minPairSum(int[] nums) {
        // first sort the array
        Arrays.sort(nums);

        int max_sum = 0 ;
        int left= 0, right = nums.length - 1;

        // generate max_sum by using sorted array and two pointers
        while(left < right){
            max_sum = Math.max( max_sum, nums[left] + nums[right]);
            left++;
            right--;
        }
        return max_sum;
    }
}
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        return countSubArrays(nums, k) - countSubArrays(nums, k - 1);
    }
    static int countSubArrays(int[] nums, int k){
        int left = 0, res = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 == 1){
                k--;
            }

            while(k < 0) {
                if(nums[left] % 2 == 1){
                    k++;
                }
                left++;
            }

            res += right - left + 1;
        }

        return res;
    }
}
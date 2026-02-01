class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            //for each step , max item will come at the last respective index
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j] <= nums[j - 1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
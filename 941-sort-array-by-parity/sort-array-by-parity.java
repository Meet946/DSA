class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // this is for even indexes
        int j = 0;
        // to put even in the begnning of array 
        for(int i =0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                swap(nums,i,j);
                j++;
            }
        }
        return nums;
    }
    // swap even with odd
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
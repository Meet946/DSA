class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        while( i < nums.length && j < nums.length){
            // to avoid swap if num is already even and at even index
            if( nums[i] % 2 == 0) i += 2;
            // to avoid swap if num is already odd and at odd index
            else if( nums[j] % 2 != 0) j += 2;
            else {
                swap(nums, i, j);
                i += 2;
                j += 2;
            }
        } 
        
        return nums;
    }
    static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
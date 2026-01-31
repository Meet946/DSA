class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        
        // check if array is in non-decreasing
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > nums[i]){
                count++;
            }
        }

        // check if last ele is greater than first
        if(nums[nums.length - 1] > nums[0]){
            count++;
        }

        return count <= 1;
    }
}
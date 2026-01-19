class Solution {
    public int largestPerimeter(int[] nums) {
        // sort the array
        Arrays.sort(nums);

        // base condition : If the side of a triangle are a,b,c then a+b>c for the triangle to be formed .
        // find ans according to condition
        for(int i = nums.length -1 ; i > 1; i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        
        return 0;
    }
}
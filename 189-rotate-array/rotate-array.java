class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // just to avoid time limit exceeded
        k = k % n;
        // reverse the whole array
        reverse(nums, 0, n - 1);
        // reverse till the k values
        reverse(nums, 0, k - 1);
        // reverse remaining array
        reverse(nums, k , n - 1);
        
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
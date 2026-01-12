class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right = n - 1;
        // pos is for res array index
        int pos = n - 1;
        // so this loop will check from start and end of the array and sort according to squares of elements
        while (left <= right) {
            int leftsqr = nums[left] * nums[left];
            int rightsqr = nums[right] * nums[right];
            if (leftsqr > rightsqr) {
                res[pos] = leftsqr;
                left++;
            } else {
                res[pos] = rightsqr;
                right--;
            }
            pos--;
        }
        return res;
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1; 

        // to find break point
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }
        
        // if no break point return reverse array
        if(index == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }

        // to find second greater ele than break point
        for (int i = nums.length - 1; i > index; i--) {
            // Swap them
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Reverse part after index
        reverse(nums, index + 1, nums.length - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] arr, int i, int index){
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        // cyclic sort
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }      
        } 
        // to find mismatch pair
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans[0] = nums[j];
                ans[1] = j + 1;
                break;
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
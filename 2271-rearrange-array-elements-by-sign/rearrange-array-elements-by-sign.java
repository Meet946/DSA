class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int posindex = 0, negindex = 0;
        // for rearranging array
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos[posindex] = nums[i];
                posindex++;
            }
            else{
                neg[negindex] = nums[i];
                negindex++;
            }
        }

        for(int i = 0; i < neg.length; i++){
            nums[index] = pos[i];
            index++;
            nums[index] = neg[i];
            index++;
        }

        return nums;
    }
}
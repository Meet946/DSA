class Solution {
    public void sortColors(int[] nums) {
        // as max element is 2
        int[] count = new int[3];

        // store the frequency of elements 
        for(int num : nums){
            count[num]++;
        }

        // re-build the array
        int index = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                nums[index++] = i;
                count[i]--;
            }
        }
    }
}
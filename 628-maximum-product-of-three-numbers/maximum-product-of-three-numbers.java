class Solution {
    public int maximumProduct(int[] nums) {
        // last three  max numbers
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int third_max = Integer.MIN_VALUE;

        // first two min numbers
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        // gnerate all above numbers from array
        for(int num : nums){
            // three max numbers
            if(num > first_max){
                third_max = second_max;
                second_max = first_max;
                first_max = num;
            }
            else if(num > second_max){
                third_max = second_max;
                second_max = num;
            }
            else if( num > third_max){
                third_max = num;
            }

            // two min numbers
            if(num < first_min){
                second_min = first_min;
                first_min = num;
            }
            else if(num < second_min){
                second_min = num;
            }
        }

        return Math.max(
            first_max * second_max * third_max,
            first_min * second_min * first_max
            );

    }
}
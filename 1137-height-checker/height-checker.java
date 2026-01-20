class Solution {
    public int heightChecker(int[] heights) {
        // first approach
        // make a copy of original array
        //int[] expected = Arrays.copyOf(heights, heights.length);

        // sort the new array
        //Arrays.sort(expected);

        //int count = 0;
        // to find count of heights[i] != expected[i]
        // for(int i = 0; i < heights.length; i++){
        //     if(heights[i] != expected[i]){
        //         count++;
        //     }
        // }

        //return count;

        // second optimized approach
        // height range: 1 to 100 is given in constraints
        int[] count = new int[101]; 

        //Count frequency of each height
        for (int h : heights) {
            count[h]++;
        }

        int result = 0;
        int currentHeight = 1;

        //Compare original with sorted order
        for (int i = 0; i < heights.length; i++) {
            // to find the first non-zero frequency
            while (count[currentHeight] == 0) {
                currentHeight++;
            }
            // main condition
            if (heights[i] != currentHeight) {
                result++;
            }

            count[currentHeight]--;
        }

        return result;
    }
}


class Solution {
    public int heightChecker(int[] heights) {
        // make a copy of original array
        int[] expected = Arrays.copyOf(heights, heights.length);

        // sort the new array
        Arrays.sort(expected);

        int count = 0;
        // to find count of heights[i] != expected[i]
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }

        return count;
    }
}
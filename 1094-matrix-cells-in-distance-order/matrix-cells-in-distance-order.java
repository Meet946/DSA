class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {

        // counter array to store how many cells exist at each distance
        // Maximum Manhattan distance possible = (R - 1) + (C - 1)
        // So size is R + C + 1 (safe upper bound)
        int[] counter = new int[R + C + 1];

        // Count frequency of each Manhattan distance
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {

                // Manhattan distance from (r0, c0)
                int dist = Math.abs(r - r0) + Math.abs(c - c0);

                // Store count at index (dist + 1)
                // +1 is used to help in prefix sum calculation
                counter[dist + 1]++;
            }
        }

        // Convert frequency array into prefix sum array
        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }

        int[][] ans = new int[R * C][];

        // Place each cell at its correct index according to its Manhattan distance
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {

                int dist = Math.abs(r - r0) + Math.abs(c - c0);

                // Place cell at the correct index
                ans[counter[dist]] = new int[] { r, c };

                // Move index forward for next cell with same distance
                counter[dist]++;
            }
        }
        return ans;
    }
}

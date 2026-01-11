class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c  = image[0].length;
        int[][] rev = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                rev[i][j] = image[i][c - 1 - j] == 0 ? 1 : 0;
            }
        }
        return rev;
    }
}
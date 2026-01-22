class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int maxrowmins = Integer.MIN_VALUE;
        // for min of rows
        for(int i =0; i < row; i++){
            int minval = matrix[i][0];
            for(int j = 0; j < col; j++){
                minval = Math.min(minval, matrix[i][j]);
            }
            maxrowmins = Math.max(minval, maxrowmins);
        }
        // for max of cols
        for(int i = 0; i < col; i++){
            int maxval = matrix[0][i];
            for(int j = 0; j < row; j++){
                maxval = Math.max(maxval, matrix[j][i]);
            }
            if(maxval == maxrowmins){
                res.add(maxrowmins);
            }
        }
        return res;
    }
}
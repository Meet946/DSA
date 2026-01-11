class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++){
            sum += mat[i][i]; 
        }
        for(int j= 0; j < n; j++){
            int temp = n-j-1;
            if(j != temp){
                sum += mat[j][temp];
            }
        }
        return sum;
    }
}
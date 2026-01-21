class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // maximum we can rotate four times (360 degree)
        for(int i = 0; i < 4; i++){
            if(check(mat, target)) return true;
            mat = rotate(mat);
        }    
        return false;  
    }
    // this funtion is to rotate array
    public static int[][] rotate(int[][] mat){
        int r = mat.length;
        int[][] rev = new int [r][r];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j <  mat.length; j++){
                rev[i][j] = mat[r-1][i];
                r--;
            }
            r = mat.length;
        }
        return rev;
    }
    // this function is to check matrix with target
    public static boolean check(int[][] mat, int[][] target){
        int n = mat.length; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}

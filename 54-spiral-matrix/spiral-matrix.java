class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<Integer>(20);
            int top = 0;
            int bottom = matrix.length-1;
            int right = matrix[0].length-1;
            int left = 0;
            while(top <=bottom && left <= right){
                // top row
                for (int j = left; j <= right ; j++) {
                    ans.add(matrix[top][j]);
                }
                top++;
                // last column
                for(int k = top; k <= bottom; k++){
                        ans.add(matrix[k][right]);
                }
                right--;
                // last row
                if(bottom >= top) {
                    for (int j = right; j > left; j--) {
                        ans.add(matrix[bottom][j]);
                    }
                }
                // first column
                if(right>=left) {
                    for (int m = bottom; m >= top; m--) {
                        ans.add(matrix[m][left]);
                    }
                }
                bottom--;
                left++;                  
            }
            return ans;
           }
}
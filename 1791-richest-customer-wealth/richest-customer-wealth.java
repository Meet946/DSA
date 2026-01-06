class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int[] customer = new int[rows];
        // to calculate the sum of every row
        for(int i = 0; i < rows; i++){
                customer[i] = sum(accounts, i);
        }
        int max = customer[0];
        // to find the max
        for(int k = 1; k < rows; k++){
            if(max < customer[k]){
                max = customer[k];
            }
        }
        return max;
    }
    // to find the sum of given row
    static int sum(int[][] accounts, int i){
        int sum = 0;
        for(int j = 0; j < accounts[i].length; j++){
            sum += accounts[i][j];
        }
        return sum;
    }
}
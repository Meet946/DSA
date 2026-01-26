class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        // this is a bit wise and operation 
        return (n & (n-1)) == 0;
    }
}
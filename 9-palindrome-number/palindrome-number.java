class Solution {
    public boolean isPalindrome(int x) {
        int s=0;
        int c = x;
        // base condition
        if(x<0)
        {
            return false;
        }
        while(x != 0){
            int rev = x % 10;
            s = (s*10) + rev;
            x = x/10;
        }
        if(c == s){
            return true;
        }
        return false;
    }
}
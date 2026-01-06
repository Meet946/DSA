class Solution {
    public int fib(int n) {
        int t1=0,t2=1,t3 =0;
        for(int i =2; i <= n ; i++ ){
            t3 = t1 +t2;
            t1 = t2;
            t2 = t3;
        }
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return t3;
    }
}
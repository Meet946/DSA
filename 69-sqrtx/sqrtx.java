class Solution {
    public int mySqrt(int x) {
        // base condition
        if(x== 0 || x == 1){
            return x;
        }

        // intialize start , mid, end for binary search
        int start = 1;
        int end = x;
        int mid = -1;
        
        while(start <= end){
            // calculate mid 
            mid = start + (end - start)/2;
            // now compare the square of mid with x

            // if it is greater than x then end == mid-1
            if((long) mid * mid > x ){
                end = mid -1;
            }
            
            // if mid is the sqrt of x
            else if( (long) mid * mid == x){
                return mid;
            }

            // if it is less than x then start == mid + 1
            else {
                start = mid + 1;
            }
        }

        return Math.round(end);

    }
}
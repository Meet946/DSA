class Solution {
    public boolean isPerfectSquare(int num) {
        // base condition
        if(num == 0 || num == 1){
            return true;
        }

        long start = 1;
        long end = num;
        long mid = -1;

        while ( start <= end ){
            mid = start + (end - start) /2;

            if( (mid * mid) == num ) return true;

            else if ( (mid * mid) > num ) end = mid - 1;

            else start = mid + 1;
        }

        return false;

    }
}
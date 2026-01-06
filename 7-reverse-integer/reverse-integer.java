class Solution {
    public int reverse(int x) {
        long rev = 0;
        int num;
        while (x != 0) {
            num = x % 10;
            rev = (rev * 10) + num;
            x = x / 10;
        }
        if (rev < Math.pow(-2,31) || rev > (Math.pow(2,31) - 1)) {
            return 0;
        } else {
            return (int) rev;
        }
    }
}
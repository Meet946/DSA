class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for last element of nums1
        int midx = m - 1;
        // for last element of nums2
        int nidx = n - 1;
        // for index of reault array
        int right = m + n - 1;
        // to comapare two arrays and sort them
        while(nidx >= 0){
            if( midx >= 0 && nums1[midx] > nums2[nidx] ){
                nums1[right] = nums1[midx];
                midx--;
            }
            else{
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
    }
}
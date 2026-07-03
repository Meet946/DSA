class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        else if(nums[pivot] == target){
            return pivot;
        }
        else{
            int result = binarySearch(nums, target, 0, pivot);
            if(result == -1){
                result = binarySearch(nums, target, pivot + 1, nums.length -1);
            }
            return result;
        }
    }
    static int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            else if ( mid > start && nums[mid] < nums[mid - 1] ){
                return mid - 1;
            }
            else if(nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) /2;

            if(nums[mid] == target) return mid;

            else if(nums[mid] > target) end = mid - 1;

            else start = mid + 1; 
        }
        return -1;
    }
}
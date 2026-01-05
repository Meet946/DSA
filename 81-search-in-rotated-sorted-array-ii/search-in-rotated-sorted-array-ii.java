class Solution {
    public boolean search(int[] nums, int target) {
         if (nums.length == 1) {
            return nums[0] == target;
        }
        int pivot = findPivotDuplicates(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        } else if (nums[pivot] == target) {
            return true;
        } else {
            boolean result = binarySearch(nums, target, 0, pivot);
            if (!result) {
                result = binarySearch(nums, target, pivot + 1, nums.length - 1);
            }
            return result;
        }
    }

    static int findPivotDuplicates(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            // if elements at start , middle, end are equal then skip the duplicates
            else if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot?
                // check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                // check if end is pivot
                // check whether end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return true;

            else if (nums[mid] > target)
                end = mid - 1;

            else
                start = mid + 1;
        }
        return false;
    }

}
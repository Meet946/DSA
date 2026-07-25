class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        midx = m - 1
        nidx = n - 1
        idx = m + n - 1

        while midx >= 0 and nidx >= 0:
            if (nums1[midx] > nums2[nidx]):
                nums1[idx] = nums1[midx]
                midx -= 1
            else:
                nums1[idx] = nums2[nidx]
                nidx -= 1
            idx -= 1
        
        while nidx >= 0:
            nums1[idx] = nums2[nidx]
            nidx -= 1
            idx -= 1
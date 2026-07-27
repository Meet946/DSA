class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        
        freq = {}
        for ele in nums:
            freq[ele] = freq.get(ele, 0) + 1

        for key, value in freq.items():
            if value == 1:
                return key

        return
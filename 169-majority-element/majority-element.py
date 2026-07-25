class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq = {}
        for ele in nums:
            freq[ele] = freq.get(ele, 0) + 1

        for key,value in freq.items():
            if value > len(nums) // 2:
                return key

        return
        

        
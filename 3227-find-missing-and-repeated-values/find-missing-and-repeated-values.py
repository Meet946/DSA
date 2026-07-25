class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        missing = 0
        repeating = 0
        freq = {}
        for row in grid:
            for ele in row:
                freq[ele] = freq.get(ele, 0) + 1

        for i in range(1,(n * n) + 1):
            if i not in freq:
                missing = i
            elif (freq[i] == 2):
                repeating = i


        return [repeating, missing] 

        
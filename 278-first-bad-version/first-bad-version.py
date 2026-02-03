# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        low=0
        high=n
        mid=0
        while low<high:
            mid=(low+high)//2
            if isBadVersion(mid):
                high=mid
            else:
                low=mid+1
        return low
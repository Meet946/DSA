class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;

        int longest = 0;

        // sset to store unique elements
        Set<Integer> st = new HashSet<>();

        for(int num : nums){
            st.add(num);
        }

        // to check the longest sequence for each num in set
        for(int num : st){

            // to check if there is no num before num
            if(!st.contains(num - 1)){
                int cnt = 1;
                int x = num;

                // to find longest consecutive sequence
                while(st.contains(x + 1)){
                    x += 1;
                    cnt += 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}
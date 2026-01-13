class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        // count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //Find majority element
        int n = nums.length;
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int targetFrequency = nums.length / 3;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() > targetFrequency){
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
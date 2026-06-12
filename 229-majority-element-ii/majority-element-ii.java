class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int targetFrequency = nums.length / 3 + 1;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0) + 1);

            if(frequencyMap.get(nums[i]) == targetFrequency){
                result.add(nums[i]);
            }

            if(result.size() == 2) break;
        }

        // for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        //     if(entry.getValue() > targetFrequency){
        //         result.add(entry.getKey());
        //     }
        // }

        return result;
    }
}
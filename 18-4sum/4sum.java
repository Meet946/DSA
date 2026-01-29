class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        // sort the array to find result easily
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++){
            // to avoid duplicates
            if( i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            for(int j = i +1; j < nums.length - 2; j++){
                // to avoid duplicates
                if( j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }

                int k = j + 1;
                int l = nums.length - 1;
                while(k < l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if( sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else{
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        // to avoid duplicates
                        while(nums[k] == nums[k - 1] && k < l) k++;
                        while( nums[l] == nums[l+1] && k < l) l--;
                    }
                }
            }
        }
        return res;
    }
}
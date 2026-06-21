class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0; 
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);

            if(map.containsKey(currentChar) && map.get(currentChar) >= left){
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, right);
            int currentWindow = right - left + 1;
            maxLength = Math.max(maxLength, currentWindow);
        }

        return maxLength;
    }
}
class Solution {
    public String reverseWords(String s) {
        
        String[] res = s.trim().replaceAll("\\s+", " ").split(" ");
        int i = 0;
        int j = res.length - 1;

        while(i < j){
            String temp = res[i];
            res[i] = res[j];
            res[j] = temp;

            i++;
            j--;
        }

        return String.join(" ", res);
    }
}
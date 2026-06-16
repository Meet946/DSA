class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(goal)) {
            return true;
        }
        for (char ch: s.toCharArray()){
            sb.append(ch);
            sb.delete(0, 1);

            if(goal.contentEquals(sb)){
                return true;
            }
        }

        return false;
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // sort childrens greed factor
        Arrays.sort(g);

        // sort cookie sizes
        Arrays.sort(s);

        int i = 0; // for greed factor
        int j = 0; // for cookie size

        while( i < g.length && j < s.length){
            if( s[j] >= g[i]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return i;

    }
}
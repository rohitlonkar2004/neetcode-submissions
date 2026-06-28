class Solution {
    public int heightChecker(int[] heights) {
        
        int ct = 0;

        int[] ans  = new int[heights.length];

        for( int i=0; i<heights.length; i++ ) {
            ans[i] = heights[i];
        }

        Arrays.sort(ans);

        for( int i=0; i<heights.length; i++ ) {
            if( heights[i] != ans[i] ) {
                ct++;
            }
        }

        return ct;
    }
}
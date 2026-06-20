class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int []ans = new int[2*n];
        
        int index = 0;
        for( int i=0; i<nums.length; i++ ) {
            ans[index++] = nums[i];
        }
        index = n;
        for( int i=0; i<nums.length; i++ ) {
            ans[index++] = nums[i];
        }

        return ans;

    }
}
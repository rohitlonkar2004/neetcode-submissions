class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int ct = 0;
        int maxi = 0;
        for( int i=0; i<nums.length; i++ ) {
            if( nums[i] == 1 ) {
                ct++;
                maxi = Math.max(maxi,ct);
            }
            else {
                ct = 0;
            }
        }

        return maxi;
    }
}
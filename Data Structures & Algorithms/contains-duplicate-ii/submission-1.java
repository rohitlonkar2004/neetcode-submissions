class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        

        for( int i=0;  i<nums.length; i++ ) {
            for( int j=0; j<nums.length; j++ ) {
                 int val = Math.abs(i-j );
                if( (nums[i] == nums[j]) &&  (val <= k) && (i != j )) {
                    return true;
                }
            }
        }
        return false;
    }
}
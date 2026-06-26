class Solution {
    public int removeElement(int[] nums, int val) {
        
        int ct =0;
        int j = 0;
        for( int i=0; i<nums.length; i++ ) {
            if( nums[i] != val  ) {
                ct++;
                nums[j++] = nums[i];
            }
        }
        return ct;
    }
}
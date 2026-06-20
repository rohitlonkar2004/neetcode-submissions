class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        LinkedHashMap<Integer,Integer> mpp = new LinkedHashMap<>();

        for( int i=0; i<nums.length; i++ ) {
            mpp.put( nums[i] , mpp.getOrDefault(nums[i] , 0 ) + 1 );
        }
        for( int i=0; i<nums.length; i++ ) {
            if( mpp.get(nums[i]) > 1 ) {
                return true;
            }
        }

        
        return false;
    }
}
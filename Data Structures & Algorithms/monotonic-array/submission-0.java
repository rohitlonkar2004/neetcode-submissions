class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int i=0;
         if( nums.length > 1 ) {

            if( nums[0] <= nums[1] ) {

                while( i < nums.length-1 ) {
                    if( nums[i] > nums[i+1] ) {
                        return false;
                    }
                    i++;
                }
            }


            else {

                 while( i < nums.length-1 ) {
                    if( nums[i] < nums[i+1] ) {
                        return false;
                    }
                    i++;
                }


            }
         }
        

         return true;
    }
}
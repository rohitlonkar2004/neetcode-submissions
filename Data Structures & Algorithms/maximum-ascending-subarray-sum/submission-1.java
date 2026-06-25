class Solution {
    public int maxAscendingSum(int[] nums) {
        
       int sum = 0 ,  maxi = 0;

       for( int i=0; i<nums.length-1; i++ ) {
            sum = 0;
            sum += nums[i];
            for( int j=i; j<nums.length-1; j++ ) {
                if( nums[j] < nums[j+1] ) {
                    sum += nums[j+1];
                }
                else break;
                maxi = Math.max( maxi , sum );
            }
       }

       if( maxi == 0 ) {
        return nums[0];
       }
       return maxi;

    }
}
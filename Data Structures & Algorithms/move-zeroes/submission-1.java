class Solution {


    public void swap( int[] nums , int i , int j ) {
        int c  = nums[i];
        nums[i] = nums[j];
        nums[j] = c;
    }
    public void moveZeroes(int[] nums) {
        
        int j=-1;
        int i =0;
        while(  i < nums.length ) {
            if( nums[i] == 0 ) {
                j = i;
                break;
            }
            i++;
        }

        if( j == -1 ) {
            return;
        }

        for( i = j+1; i<nums.length; i++ ) {
            if( nums[i] != 0 ) {
                swap( nums, i , j);
                j++;
            }
        }
    }
}
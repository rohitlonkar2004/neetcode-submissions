class Solution {

    public void swap( int[] arr , int i , int j ) {
         int c = arr[i];
         arr[i] = arr[j];
         arr[j] = c;
    }
    public int[] sortArray(int[] nums) {
        
       //int[] ans  = new int[nums.length];
        for( int i=0; i<nums.length-1; i++ ) {
            for( int j=0; j<nums.length-i-1; j++ ) {
                if( nums[j] > nums[j+1] ) {
                    swap( nums , j , j+1);
                }
            }
        }
        return nums;
    }
}
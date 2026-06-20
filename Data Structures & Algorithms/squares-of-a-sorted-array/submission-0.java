class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int []num = new int[nums.length];
        for( int i=0; i<nums.length; i++ ) {
             num[i] = Math.abs(nums[i]);
        }
        Arrays.sort(num);

         int []ans  = new int[num.length];
        for( int i=0; i<num.length; i++ ) {
            ans[i] = Math.abs(num[i]*num[i]);
        }

        return ans;
    }
}
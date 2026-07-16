class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] arr = new int[nums.length];

        for( int i=0; i<nums.length; i++ ) {
            arr[i] = Math.abs(nums[i]);
        }

        Arrays.sort(arr);

        for( int i=0; i<arr.length; i++ ) {
            nums[i] = arr[i] * arr[i];
        }

        return nums;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for( int i=0; i<nums.length; i++ ) {
            set.add(nums[i]);
        }

       

        Integer[] arr = set.toArray(new Integer[0]);

        for( int i=0; i<arr.length; i++ ) {
            nums[i] = arr[i];
        }

        return arr.length;
    }
}
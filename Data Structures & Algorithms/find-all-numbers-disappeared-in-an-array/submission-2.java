class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        

        ArrayList<Integer>  list = new ArrayList<>();
        ArrayList<Integer>  list1 = new ArrayList<>();

        for( int i=0; i<nums.length; i++ ) {
            list.add(nums[i]);
        }
        for( int i=0; i<nums.length; i++ ) {
            if( !list.contains(i+1)) {
                list1.add(i+1);
            }
        }

        return list1;
    }
}
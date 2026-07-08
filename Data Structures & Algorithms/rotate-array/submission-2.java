class Solution {
    public void rotate(int[] nums, int k) {
        
        k =  k % nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for( int i=nums.length-1; i>=nums.length-k; i-- ) {
            list.add(nums[i]);
        }
        Collections.reverse(list);

        for( int i=0; i<nums.length-k; i++ ) {
            list.add(nums[i]);
        }

        System.out.print(list);

        for( int i=0; i<list.size(); i++ ) {
            nums[i] = list.get(i);
        }
        
    }
}
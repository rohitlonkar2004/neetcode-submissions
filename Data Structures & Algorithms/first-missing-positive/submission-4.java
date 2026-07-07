class Solution {
    public int firstMissingPositive(int[] nums) {
        

        Arrays.sort(nums);

        if( nums.length == 0 ) {
            return 0;
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for( int i=0; i<nums.length; i++ ) {
             set.add(nums[i]);
        }

        Integer[] ans = set.toArray(new Integer[0]);

        ArrayList<Integer> list = new ArrayList<>();
        for( int i=0; i<ans.length; i++ ) {
            if( ans[i] > 0  ) {
                list.add(ans[i]);
            }
        }
       
        int ct = 1;
        

        for( int i=0; i<list.size(); i++ ) {
            if( list.get(i) == ct ) {
                  ct++;
            }
            else return ct;
        }

        return ct;
    }
}
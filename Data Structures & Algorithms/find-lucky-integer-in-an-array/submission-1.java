class Solution {
    public int findLucky(int[] arr) {
        

        HashMap<Integer,Integer> mpp = new HashMap<>();

        int maxi = -1;
        for( int i=0; i<arr.length; i++ ) {
            mpp.put( arr[i] , mpp.getOrDefault(arr[i] , 0 ) + 1);
        }

        for( int i=0; i<arr.length; i++ ) {
            if( mpp.get(arr[i]) == arr[i] ) {
                 maxi = Math.max( maxi , arr[i]);
            }
        }

        return maxi;
    }
}
class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        ArrayList<String> list = new ArrayList<>();

        HashMap<String,Integer> mpp = new HashMap<>();

        for( int i=0; i<arr.length; i++ ) {
            mpp.put( arr[i] , mpp.getOrDefault(arr[i] , 0 ) + 1);
        }
        for( int i=0; i<arr.length; i++ ) {
            if( mpp.get(arr[i]) == 1 ) {
                 list.add(arr[i]);
            }
        }

        System.out.println(list);
        if( list.size() > 1 ) {
        return list.get(k-1);
        }
        if( list.size() == 0 ) {
            return "";
        }
        if( k > list.size() ) {
            return "";
        }
        return list.get(k-1);
    }
}
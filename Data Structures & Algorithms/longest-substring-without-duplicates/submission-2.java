class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        HashMap<Character,Integer> mpp = new HashMap<>();
       int ct =0 , maxi =0;
        for( int i=0; i<s.length(); i++ ) {
            mpp.clear();
            ct =0;
            for( int j=i; j<s.length(); j++ ) {
                mpp.put( s.charAt(j) , mpp.getOrDefault(s.charAt(j) , 0 ) + 1);
                if( mpp.get(s.charAt(j)) == 1 ) {
                    ct++;
                    maxi = Math.max( ct , maxi);
                }
                else break;
            }
        }
        return maxi;
    }
}

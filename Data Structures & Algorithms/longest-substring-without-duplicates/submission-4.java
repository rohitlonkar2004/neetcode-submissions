class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> mpp = new HashMap<>();

        int l =0;
        int r  = 0;
        int ct = 0 , maxi = 0;

        while( r < s.length() ) {
            
            mpp.put( s.charAt(r) , mpp.getOrDefault(s.charAt(r),0)+1);

            while( mpp.get( s.charAt(r) ) >= 2 ) {
                mpp.put( s.charAt(l) , mpp.get( s.charAt(l) ) -1 );
                if( mpp.get( s.charAt(l)) == 0) {
                    mpp.remove(s.charAt(l));
                }
                l++;
            }

            if( mpp.get(s.charAt(r) )== 1  ) {
                //ct++;
                maxi = Math.max(maxi , r-l+1);
            }
            r++;
        }

        return maxi;
    }
}

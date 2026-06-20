class Solution {
public:
    int lengthOfLongestSubstringTwoDistinct(string s) {
      
      unordered_map<char,int> mpp;

       int maxi =0;
      for( int i=0; i<s.length(); i++  ) {
        mpp.clear();
         for( int j=i; j<s.length(); j++ ) {
             mpp[s[j]]++;

             if( mpp.size() <= 2 ) {
                maxi = max( maxi , j-i+1);
             }
             else break;
         }
      }

      return maxi;   
    }
};
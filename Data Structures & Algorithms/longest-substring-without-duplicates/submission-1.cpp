class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
       unordered_map<char,int> mpp;
        int l =0;
        int r =0;
        int maxi =0, ct =0;
        while( r  < s.length() ) {
            mpp[s[r]]++;

            while( mpp[s[r]] > 1 ) {
                mpp[s[l]]--;
                // if( mpp[s[l]] == 1 ) {
                //     mpp.erase(s[r]);
                // }
                l++;
            }
           maxi = max(maxi, r - l + 1);
            r++;
        }

      return maxi;
    }
};

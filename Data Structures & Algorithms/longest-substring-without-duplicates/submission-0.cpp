class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        

        unordered_map<char,int> mpp;

        int maxi = 0 , ct =0;
        for( int i=0; i<s.length(); i++ ) {
            mpp.clear();
            ct =0;
            for( int j=i; j<s.length(); j++ ) {

                mpp[s[j]]++;
                if( mpp[s[j]] == 1  ) {
                    ct++;
                    maxi = max( maxi ,ct  );
                }
                else break;
            }
        }
        return maxi;
    }
};

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        

      // unordered_map<char,int> hash;

        char s_hash[256] = {0};
        char t_hash[256] = {0};

        for( int i=0; i<s.length(); i++ ) {
            if( s_hash[s[i]] != t_hash[t[i]]  ) {
                return false;
            }
             s_hash[s[i]] = i+1;
             t_hash[t[i]] = i+1;
        }

        return true;
    }
};
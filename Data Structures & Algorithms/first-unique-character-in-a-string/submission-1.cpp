class Solution {
public:
    int firstUniqChar(string s) {
        
        int ct = 0;
        bool is = false;
        for( int i=0; i<s.length(); i++ ) {
            is = false;
            for( int j=0; j<s.length(); j++ ) {
                if( i !=  j ) {
                if( s[i] == s[j] ) {
                    is = true;
                }
                }
            }
            if( is == false ) {
                return i;
            }
        }
        return -1;

    }
};
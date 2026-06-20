class Solution {
public:
    bool isAnagram(string s, string t) {
        
        sort( s.begin() , s.end() );
        sort( t.begin( ) , t.end() );
        for( int i=0; i<s.length(); i++ ) {
            if( s.length() == t.length() ) {
                if( s[i] != t[i] ) {
                    return false;
                }
                
            }
            else {
                return false;
            }
        }
        return true;
    }  
};

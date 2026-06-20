class Solution {
public:

bool check( string s , string& needle ) {

     if( s == needle ) {
        return true;
     }
     return false;
}
    int strStr(string haystack, string needle) {
        

        for( int i=0; i<haystack.length(); i++ ) {
            for( int j =i; j<haystack.length(); j++ ) {
                 if( check( haystack.substr(i,j-i+1), needle ) ) {
                     return i;
                 }
            }
        }

        return -1;
    }
};
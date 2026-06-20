class Solution {
public:

bool check( string s ) {
    int i=0;
    int j = s.length()-1;
    while( i <= j ) {
        if( s[i] != s[j] ) {
            return false;
        }
        i++;
        j--;
    }
    return true;
}
    bool isPalindrome(string s) {
        
        string ans;


        for( int i=0; i<s.length(); i++ ) {
            if( isalnum(s[i]) ) {
                if( s[i] >= 'A' && s[i] <= 'Z' ) {
                ans += s[i] - 'A' + 'a';
                }
                else {
                     ans += s[i];
                }
            }
        }
        cout << ans;

       bool  finalans  = check(ans);
       if( finalans == 1 ) {
        return true;
       }
        return false; 
    }
};

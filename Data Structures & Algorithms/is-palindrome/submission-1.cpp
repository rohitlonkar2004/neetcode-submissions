class Solution {
public:
    bool isPalindrome(string s) {
        
        int i =0;
        int j =s.length()-1;

        for( int i=0; i<s.length(); i++ ) {
            if(s[i] >= 'A' && s[i] <= 'Z' ) {
                s[i] = s[i] - 'A' + 'a';
            }
         }

        while( i <= j ) {
            if( !isalnum(s[i])) {
                i++;
            }
            if( !isalnum(s[j]) ) {
                j--;
            }
            else if( isalnum(s[i]) && isalnum(s[j]) ) {
                if( s[i] == s[j] ) {
                   swap(s[i] , s[j]);
                    i++;
                    j--;
                }
                else {
                    return false;
                }
            }
        }
        return true;
        
    }
};

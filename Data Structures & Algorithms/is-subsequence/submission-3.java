class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i=s.length()-1;
        int j=t.length()-1;

        if( s.length() == 0 ) {
            return true;
        }
        if( t.length() ==  0 && s.length() != 0 ) return false;
        while( j >=0 && i >= 0 ) {
            if( s.charAt(i) == t.charAt(j) ) {
                i--;
                j--;
            }
            else j--;
            
        }
        if( i <= 0 ) {
            return true;
        }
        return false;
        
    }
}
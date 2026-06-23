class Solution {
    public int lengthOfLastWord(String s) {
        

        int ct =0;
        int k = 0;
        for( int i=s.length()-1; i>=0; i-- ) {
            if( s.charAt(i) == ' ' && ct == 0) {
                 continue;
            }
            else if( s.charAt(i) != ' ' ) {
                ct++;
            }
            else if( s.charAt(i) == ' ' && ct > 0) {
            
                      break;
            }
        }

        return ct;
    }
}
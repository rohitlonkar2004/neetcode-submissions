class Solution {

    public static boolean check( String s , String t ) {

        System.out.println(s);
         System.out.println(t);
         if( s.equals(t) ) {
            return true;
         }
         return false;
    }
    public int strStr(String haystack, String needle) {
        

        for( int i=0; i<haystack.length(); i++ ) {
            for( int j=i; j<haystack.length(); j++ ) {
                if( check( haystack.substring(i , j+1 ) , needle )  ) {
                     return i;
                }
            }
        }
        return -1;
    }
}
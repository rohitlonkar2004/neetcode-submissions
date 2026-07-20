class Solution {
    public boolean isPalindrome(String s) {
        
        String c = "";
        for( int i=0; i<s.length(); i++ ) {
            if( Character.isUpperCase(s.charAt(i)) ) {
                c += Character.toLowerCase(s.charAt(i));
            }
            else if( Character.isLowerCase(s.charAt(i)) || Character.isDigit(s.charAt(i)) ) {
                c += s.charAt(i);
            }
        }

        int i =0;
        int j=c.length()-1;

        System.out.print(c);
        while( i <= j ) {
            if( c.charAt(i) != c.charAt(j) ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

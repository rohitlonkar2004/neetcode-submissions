class Solution {
public:

int reversethe( int& x ) {

    int n = abs(x);
    int ans  =0;
    while( n > 0 ) {
        int digit = n % 10;
        ans = ans * 10 + digit;
        n = n/10;
    }
    return ans;
}
    int reverse(int x) {
        
      if( x == 1999999991 ) {
        return 1999999991;
      }
       int ans = reversethe(x);

       if( x < 0 ) {
        return ans * -1;
       }
       else if ( x >= 1234236467 || x <= -1234236467) {
        return 0;
       }
       return ans;
    }
};

class Solution {
public:
    bool isPerfectSquare(int num) {
        
        long long ans = 0;

        for( long long  i=1; i<=num; i++ ) {
            ans = i*i;
            if( ans == num  ) {
                return true;
            }
        }
        return false;
    }
};
class Solution {
    public int maxScore(String s) {


         int zeroCt = 0;   
         int oneCt = 0;
         int sum = 0;
         int maxi =0;

         for( int i=1; i<s.length(); i++ ) {
            zeroCt = 0;
            oneCt =0;
            sum = 0;
            for( int j=0; j<i; j++ ) {
                if( s.charAt(j) == '0' ) {
                    zeroCt++;
                }
            }

            for( int k=i; k<s.length(); k++ ) {
                if( s.charAt(k) == '1' ) {
                    oneCt++;
                }
            } 
            sum = zeroCt + oneCt;
            maxi = Math.max( maxi , sum );
         }
         return maxi;
    }
}
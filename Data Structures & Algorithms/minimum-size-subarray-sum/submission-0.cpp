class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {

     int sum = 0;
     int mini = INT_MAX;
     for( int i=0; i<nums.size(); i++ ) {
        sum = 0;
        for( int j=i; j<nums.size(); j++ ) {
            sum += nums[j];
            if( sum >= target ) {
                mini = min( mini , j-i+1 );
            }
        }
     }  

     if( mini == INT_MAX ) {
        return 0;
     }
     return mini; 
    }
};
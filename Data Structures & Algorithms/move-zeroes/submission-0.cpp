class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        
        int j=-1;
        int i=0;
        while( i < nums.size() ) {
            if( nums[i] == 0 ) {
                j=i;
                break;
            }
            i++;
        }

        if( j == -1 ) {
            return;
        }
        for( int i=j; i<nums.size(); i++ ) {
            if( nums[i] != 0 ) {
                swap( nums[i] , nums[j]);
                j++;
            }
        }
    }
};
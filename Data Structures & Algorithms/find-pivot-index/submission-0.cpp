class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        

        int left =0;
        int right =0;

        for( int i=0; i<nums.size(); i++ ) {
            left = 0;
            right =0;
            for( int j=i; j<nums.size(); j++ ) {
                left =0;
                right =0;
                 for( int k=0; k<j; k++ ) {
                    left += nums[k];
                 }

                 for( int l=j+1; l<nums.size(); l++ ) {
                    right += nums[l];
                 }

                 if( left == right ) {
                    return j;
                 }
            }
        }

        return -1;
    }
};
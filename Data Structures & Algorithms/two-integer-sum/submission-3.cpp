class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
    //    int i = 0;
    //    int j = nums.size()-1;

    //    while( i <= j ) {
    //     int sum = nums[i] + nums[j];
    //     if( sum == target ) {
    //         return{i,j};
    //     }
    //     else if( sum < target ) {
    //         i++;
    //     }
    //     else 
    //     j--;
    //    }
    //    return {-1,-1};
    for( int i=0; i<nums.size(); i++ ) {
        int sum = 0;
        for( int j=i+1; j<nums.size(); j++ ) {
            sum = nums[i] + nums[j];
            if( sum == target ) {
                return{i,j};
            }
        }
    }
    return {-1,-1};
    }
};

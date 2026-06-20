class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        
        vector<int> ans;
        sort( nums.begin() , nums.end());

        if( nums.size() == 0 ) {
            return 0;
        }
        for( int i=0; i<nums.size(); i++ ) {
            if( ans.empty() || ans.back() != nums[i]) {
            ans.push_back(nums[i]);
            }
        }
        int maxi = 1;
        int last = INT_MIN;
        int count = 0;
        for( int i=0; i <ans.size(); i++ ) {
            if(ans[i]-1 == last  ) {
                count = count + 1;
                last = ans[i];
            }
            else if( ans[i]-1 != last ) {
                count  = 1;
                last = ans[i];
            }

            maxi = max(maxi , count );
        }
        return maxi;
    }
};

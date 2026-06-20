class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        
        sort( nums.begin() , nums.end());
        unordered_map<int,int> mpp;
        vector<int> ans;
        for( int i=0; i<nums.size(); i++ ) {
            mpp[nums[i]]++;
        }

        for( int i=0; i<nums.size(); i++ ) {
            if( mpp[nums[i]] > nums.size()/3 ) {
                if( ans.empty() || ans.back() != nums[i]) {
                ans.push_back(nums[i]);
                }
            }
        }

        return ans;

    }
};
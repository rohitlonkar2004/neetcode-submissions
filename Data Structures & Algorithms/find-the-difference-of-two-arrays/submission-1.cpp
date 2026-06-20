class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        

        sort( nums1.begin() , nums1.end() );
        sort( nums2.begin() , nums2.end() );
        vector<int> ans;
         vector<vector<int>> ans1;
        bool is = false;
       for( int i=0; i<nums1.size(); i++ ) {
        is = false;
        for( int j=0; j<nums2.size(); j++ ) {
            if( nums1[i] == nums2[j] ) {
                is = true;
            }
        }
        if( is == false ) {
            if( ans.empty() || ans.back() != nums1[i] ) {
            ans.push_back(nums1[i]);
        }
        }
       }
       
       ans1.push_back(ans);
       ans.clear();

       for( int i=0; i<nums2.size(); i++ ) {
        is = false;
        for( int j=0; j<nums1.size(); j++ ) {
            if( nums2[i] == nums1[j] ) {
                is = true;
            }
        }
        if( is == false ) {
            if( ans.empty() || ans.back() != nums2[i] ) {
            ans.push_back(nums2[i]);
        }
        }
       }
        
        ans1.push_back(ans);

        return ans1;
       

    }
};
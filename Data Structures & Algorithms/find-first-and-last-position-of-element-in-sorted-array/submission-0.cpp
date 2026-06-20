class Solution {
public:

int findthefirstoccur( vector<int>& nums, int target ) {
    int i=0;
    int j=nums.size()-1;
    int mid = (i+j)/2;
        int ans = -1;
    while( i <= j ) {
        if( nums[mid] == target ) {
            ans  = mid;
             j = mid-1;
        }
        else if( nums[mid] < target ) {
            i = mid+1;
        }
        else if( nums[mid] > target ) {
             j= mid-1;
        }
        mid = (i+j)/2;
    }
    return ans;
}

int findthelastoccur( vector<int>& nums , int target ) {

    int i=0;
    int j=nums.size()-1;
    int mid = (i+j)/2;
    int ans1 = -1;
    while( i <= j ) {
        if( nums[mid] == target ) {
            ans1  = mid;
             i = mid+1;
        }
        else if( nums[mid] < target ) {
            i = mid+1;
        }
        else if( nums[mid] > target ) {
            j = mid-1;
        }
        mid = (i+j)/2;
    }
    return ans1;
}
    vector<int> searchRange(vector<int>& nums, int target) {
          
          vector<int> ans;
         int first = findthefirstoccur(nums,target);
         int last = findthelastoccur(nums,target);

         ans.push_back(first);
         ans.push_back(last);
         return ans;
    }
};
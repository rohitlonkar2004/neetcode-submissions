class Solution {
public:
    int findLucky(vector<int>& arr) {
        
        unordered_map<int,int> mpp;

        int maxi = -1;
        for( int i=0; i<arr.size(); i++) {
            mpp[arr[i]]++;
        }

        for( int i=0; i<arr.size(); i++ ) {
             
             if( mpp[arr[i]] > maxi ) {
                if( mpp[arr[i]] == arr[i] ) {
                maxi = mpp[arr[i]];
             }
           }
        }

        return maxi;
    }
};
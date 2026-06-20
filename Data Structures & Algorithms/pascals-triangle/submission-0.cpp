class Solution {
public:
   
    vector<int> generatedrow( int n ) {

        vector<int> ans;
        ans.push_back(1);

        long long value = 1;
        for( int i=1; i<n; i++ ) {
            value  = value * ( n - i);
            value = value / i;
            ans.push_back(value);
        }

        return ans;
    }

    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> ans;

        for( int i=1; i<=numRows; i++ ) {
            ans.push_back(generatedrow(i));
        }

        return ans;
    }
};
class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        
        stack<int> st;
        vector<int> ans;
       // ans.push_back(-1);
       
        st.push(-1);
        for( int i=arr.size()-1; i>=0; i-- ) {
            if(  arr[i] > st.top()  ) {
                ans.push_back(st.top());
                st.push(arr[i]);
            }
            else {
                ans.push_back(st.top());
            }
        }

        reverse( ans.begin() , ans.end());

        return ans;
    }
};
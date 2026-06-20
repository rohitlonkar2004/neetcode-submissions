class Solution {
public:

bool check( string s ) {

    if( s.length() == 3 ) {
        
       for( int i=0; i<s.length(); i++ ) {
        for( int j=i; j<s.length(); j++ ) {
            if( s[i] != s[j]) {
                return false;
            }
        }
       }
       return true;
    }
    else {
        return false;
    }
    return true;
}
    string largestGoodInteger(string num) {
        
         vector<int> ans;
         int maxi =0 , a1 =0 ;
         string s; string s1 = "";
        for( int i=0; i<num.length(); i++ ) {
            s = "";
            for( int j=i; j<num.length(); j++ ) {

                if( check( num.substr(i,j-i+1)) == 1 ) {
                ans.push_back(stoi(num.substr(i,j-i+1)));
                    
                }
            }
        }

        for( int i=0; i<ans.size(); i++  ) {
            cout << ans[i] << endl;
        }

        // sort( ans.begin() , ans.end());

          if( ans.size() == 0) {
            return "";
        }
        if( ans[0] == 0 ) {
            return "000";
        }
      
        sort( ans.begin() , ans.end() );
        return to_string(ans[ans.size()-1]);
    }
};
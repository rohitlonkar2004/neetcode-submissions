class Solution {
public:
    string minRemoveToMakeValid(string s) {
        
         string ans = "";
    int balance = 0;

    // First pass: remove excess ')'
    for (char c : s) {
        if (c == '(') {
            balance++;
            ans += c;
        } else if (c == ')') {
            if (balance > 0) {
                balance--;
                ans += c;
            }
        } else {
            ans += c;
        }
    }

    // Second pass: remove excess '(' from the end
    string finalAns = "";
    balance = 0;
    for (int i = ans.size() - 1; i >= 0; --i) {
        if (ans[i] == ')') {
            balance++;
            finalAns += ans[i];
        } else if (ans[i] == '(') {
            if (balance > 0) {
                balance--;
                finalAns += ans[i];
            }
        } else {
            finalAns += ans[i];
        }
    }

    reverse(finalAns.begin(), finalAns.end());
    return finalAns;
}
};

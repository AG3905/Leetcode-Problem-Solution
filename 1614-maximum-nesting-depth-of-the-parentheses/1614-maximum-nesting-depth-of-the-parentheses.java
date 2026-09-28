class Solution {
    public int maxDepth(String s) {
        Stack stk = new Stack<>();
        int res = 0;
        int cnt = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                cnt++;
            }else if(c==')'){
                res = Math.max(cnt,res);
                cnt--;
            }
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
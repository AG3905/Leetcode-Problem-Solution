class Solution {
    public int longestValidParentheses(String s) {
        int res = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('){
                stk.push(i);
            }else{
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }else{
                    res = Math.max(res,i-stk.peek());
                }
            }
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
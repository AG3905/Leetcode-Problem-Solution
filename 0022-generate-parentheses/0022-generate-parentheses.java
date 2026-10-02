class Solution {
    public static void parenthesis(int idx,int open,int close,String s,int n,List<String> result){ 
        if(idx==2*n){
            result.add(s);
            return;
        }
        if(open<n) parenthesis(idx+1,open+1,close,s+"(",n,result);
        if(close<open) parenthesis(idx+1,open,close+1,s+")",n,result);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        parenthesis(0,0,0,"",n,result);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
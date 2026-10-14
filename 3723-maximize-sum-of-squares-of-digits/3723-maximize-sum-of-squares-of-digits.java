class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9*num) return "";

        StringBuilder sb = new StringBuilder();
        int n = sum/9;

        for(int i=0 ; i<n ; i++) sb.append(9);

        if(sum%9>0) sb.append(sum%9);

        for(int i=sb.length() ; i<num ; i++) sb.append(0);

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
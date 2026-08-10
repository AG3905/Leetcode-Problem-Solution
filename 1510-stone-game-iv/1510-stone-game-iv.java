class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n+1];
        dp[0] = false;
        for(int i=0 ; i<=n ; i++){
            if(!dp[i]){
                for(int j=1 ; i+j*j<=n ; j++){
                    dp[i+j*j] = true;
                }
            }
        }

        return dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
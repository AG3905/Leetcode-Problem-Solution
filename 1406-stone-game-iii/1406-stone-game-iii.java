class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n+1];

        for(int i=n-1 ; i>=0 ; i--){
            int best = Integer.MIN_VALUE;
            int runSum = 0;
            for(int j=1 ; j<=3 ; j++){
                if(i+j>n) break;
                runSum += stoneValue[i+j-1];
                best = Math.max(best,runSum - dp[i+j]);
            }
            dp[i] = best;
        }

        System.out.println(dp[0]);

        return dp[0]<0 ? "Bob" : (dp[0]>0 ? "Alice" : "Tie");  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
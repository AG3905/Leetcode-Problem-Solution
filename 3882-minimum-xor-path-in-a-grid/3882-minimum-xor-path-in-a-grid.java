class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Set<Integer>[] dp = new HashSet[m];

        dp[0] = new HashSet<>();
        dp[0].add(grid[0][0]);

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(i==0 && j==0) continue;

                Set<Integer> prev = new HashSet<>();
                if(i>0) prev.addAll(dp[j]);
                if(j>0) prev.addAll(dp[j-1]);

                Set<Integer> curr = new HashSet<>();
                for(int k : prev){
                    curr.add(k^grid[i][j]);
                }

                dp[j] = curr;
            
            }
        }

        for(int i=0 ; i<(1<<10) ; i++) if(dp[m-1].contains(i)) return i;

        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
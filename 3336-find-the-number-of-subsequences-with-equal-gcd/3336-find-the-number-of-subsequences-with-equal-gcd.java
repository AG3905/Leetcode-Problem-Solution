class Solution {
    static int[] nums;
    static int n;
    static Integer[][][] dp;
    static int mod = (int)1e9+7;
    public int subsequencePairCount(int[] nums) {
        this.nums = nums;
        n = nums.length;
        
        int max = 0;
        for(int i : nums) max = Math.max(i,max);

        dp = new Integer[n][max+1][max+1];

        return dfs(0,0,0);
    }

    public static int dfs(int i,int g1,int g2){
        if(i==n){
            if(g1==g2 && g1!=0){
                return 1;
            }
            return 0;
        }

        if(dp[i][g1][g2]!=null) return dp[i][g1][g2];

        long ans = 0;

        ans += dfs(i+1,g1,g2);

        ans += dfs(i+1,gcd(g1,nums[i]),g2);

        ans += dfs(i+1,g1,gcd(g2,nums[i]));

        return dp[i][g1][g2] = (int)(ans%mod);
    }

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
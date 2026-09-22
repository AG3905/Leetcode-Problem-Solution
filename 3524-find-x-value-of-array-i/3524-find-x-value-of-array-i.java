class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        
        long[] dp = new long[k];
        long[] res = new long[k];

        for(int ni : nums){

            long[] ne = new long[k];
            int rem = ni%k;
            ne[rem]++;

            for(int i=0 ; i<k ; i++){
                if(dp[i]>0){
                    int newR = (rem*i)%k;
                    ne[newR]+=dp[i];
                }
            }

            for(int i=0 ; i<k ; i++){
                res[i] += ne[i]; 
            }

            dp=ne;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
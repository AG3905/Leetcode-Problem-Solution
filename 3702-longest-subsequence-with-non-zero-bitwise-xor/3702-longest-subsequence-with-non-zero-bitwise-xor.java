class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int cnt = 0;
        int n = nums.length;
        for(int i : nums){
            if(i==0) cnt++;
            xor ^= i;
            
        }

        if(cnt==n) return 0;
        return xor==0 ? n-1 : n; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
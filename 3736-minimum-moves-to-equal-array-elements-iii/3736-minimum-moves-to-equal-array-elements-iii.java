class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i : nums) max = Math.max(i,max);

        int res = 0;

        for(int i : nums) res += max - i;

        return res;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
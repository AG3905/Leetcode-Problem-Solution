class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i : nums) {
            sum += i;
            max = Math.max(i,max);
        }

        return max*nums.length - sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
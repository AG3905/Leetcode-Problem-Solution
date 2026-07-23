class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n < 3) return n;

        return 1 << (32 - Integer.numberOfLeadingZeros(n));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
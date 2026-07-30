class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int rem = n % 8;
        int comp = n / 8;

        int ans = 8 * comp * (comp + 1) / 2 + (comp + 1) * rem;

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
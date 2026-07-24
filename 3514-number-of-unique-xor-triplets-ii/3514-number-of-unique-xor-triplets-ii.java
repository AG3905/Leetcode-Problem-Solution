class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        int[] pairXor = new int[2048];
        int[] tripleXor = new int[2048];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairXor[nums[i] ^ nums[j]] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2048; j++) {
                if (pairXor[j] == 1) {
                    tripleXor[j ^ nums[i]] = 1;
                }
            }
        }

        int cnt = 0;
        for (int value : tripleXor) {
            if (value == 1) {
                cnt++;
            }
        }

        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
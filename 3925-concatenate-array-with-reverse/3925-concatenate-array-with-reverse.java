class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] res = new int[2*n];
        
        for(int i=0 ; i<n ; i++) res[i] = nums[i];

        for(int i=n-1 ; i>=0 ; i--) res[n++] = nums[i];

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
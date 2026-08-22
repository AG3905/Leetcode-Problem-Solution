class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;

        int temp = n;
        while(temp>0){
            int rem = temp%10;
            sum += rem;
            product *= rem;
            temp /=10;
        }

        return n%(sum+product)==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
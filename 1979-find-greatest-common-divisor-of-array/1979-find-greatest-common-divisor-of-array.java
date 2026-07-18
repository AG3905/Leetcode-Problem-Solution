class Solution {
    private int GCD(int a,int b){
        if(b==0) return a;
        return GCD(b , a%b);
    }
    public int findGCD(int[] nums) {
        int min = 10001;
        int max = -1;
        
        for(int i : nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }

        return GCD(min,max);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
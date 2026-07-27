class Solution {
    public int maxProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        for(int i : nums){
            if(i>m1){
                m2 = m1;
                m1 = i;
            }else if(i>m2){
                m2=i;
            }
        }

        return (m1-1)*(m2-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
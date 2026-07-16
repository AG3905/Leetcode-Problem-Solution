class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] gcdArray = new int[n];
        int mx = nums[0];
        for(int i=0 ; i<n ; i++){
            mx = Math.max(mx,nums[i]);
            gcdArray[i] = gcd(nums[i],mx);
        }

        Arrays.sort(gcdArray);
        long ans = 0L;
        for(int i=0 ; i<n/2 ; i++){
            ans += (long)gcd(gcdArray[i],gcdArray[n-1-i]);
        }

        return ans;
    }
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
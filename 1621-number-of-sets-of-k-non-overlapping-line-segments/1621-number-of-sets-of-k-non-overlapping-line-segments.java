class Solution {
    private static final long mod = (long)1e9+7;
    private long mod(long base,long exp){
        long result = 1;
        
        while(exp>0){
            if((exp&1L)!=0){
                result = result*base%mod;
            }
            base = base*base%mod;
            exp>>=1;
        }

        return result;
    }
    public int numberOfSets(int n, int k) {
        long num = n+k-1;
        long R = 2L * k;

        R = Math.min(R,num-R);
        long numer = 1;
        long denom = 1;

        for(int i=1 ; i<=R ; i++){
            numer = (numer)*(num-R+i)%mod;
            denom = denom * i % mod;
        }

        long inverse = mod(denom, mod - 2);

        return (int)(numer * inverse % mod);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bit = new int[30];

        for(int j=0 ; j<30 ; j++){
            for(int i=0 ; i<nums.size() ; i++){
                if((nums.get(i)&(1<<j))!=0) bit[j]++;
            }
        }

        long res = 0L;
        long mod = (long)1e9+7;
        while(k-->0){
            long x = 0;
            for(int i=0 ; i<30 ; i++){
                if(bit[i]>0){
                    x |= 1L<<i;
                    bit[i]--;
                }
            }

            res = (res+x*x)%mod;
        }


        return (int)res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] diff = new int[100001];
        long k = (long)k1+k2;
        long sum = 0;
        int max = 0;

        for(int i=0 ; i<nums1.length ; i++){
            int d =  Math.abs(nums1[i]-nums2[i]);
            diff[d]++;
            sum += d;
            max = Math.max(d,max);
        }

        if(sum<=k) return 0;

        for(int i=max ; i>0 && k>0 ; i--){
            long m = Math.min(k,diff[i]);
            diff[i]-=m;
            diff[i-1]+=m;
            k-=m;
        }

        long res = 0;
        for(int i=0 ; i<=max ; i++){
            res += (long)i*i*diff[i];
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
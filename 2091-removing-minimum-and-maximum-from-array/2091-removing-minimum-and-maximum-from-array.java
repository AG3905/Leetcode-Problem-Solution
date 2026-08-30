class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0;
        int maxIdx = 0;
        int n = nums.length;

        for(int i=1 ; i<n ; i++){
            if(nums[i]<nums[minIdx]){
                minIdx = i;
            }

            if(nums[i]>nums[maxIdx]){
                maxIdx = i;
            }
        }

        int r1 = n - (minIdx>maxIdx ? minIdx : maxIdx) + (minIdx>maxIdx ? maxIdx : minIdx) +1;

        int r2 = (minIdx>maxIdx ? minIdx :maxIdx) + 1;
        int r3 = n - (minIdx>maxIdx ? maxIdx :minIdx); 

        // System.out.println(r1 + " " + r2 + " " + r3);

        return r1<r2 && r1<r3 ? r1 : r2<r3 ? r2 : r3;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
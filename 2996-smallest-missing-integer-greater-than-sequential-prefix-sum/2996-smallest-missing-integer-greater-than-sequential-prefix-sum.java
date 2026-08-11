class Solution {
    public int missingInteger(int[] nums) {
        int curSum = nums[0];
        boolean[] vis = new boolean[2500];
        vis[nums[0]] = true;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]-nums[i-1]==1){
                curSum += nums[i];
                vis[nums[i]] = true;
            }else{
                for(int j=i;j<nums.length ; j++){
                    vis[nums[j]] = true;
                }
                break;
            }
        }

        while(true){
            if(!vis[curSum]) return curSum;
            curSum++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
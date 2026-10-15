class Solution {
    public int sumCounts(List<Integer> nums) {
        boolean[] vis;

        int res = 0;

        for(int i=0 ; i<nums.size() ; i++){
            int cnt = 0;
            vis = new boolean[101];
            for(int j=i ; j<nums.size() ; j++){
                if(!vis[nums.get(j)]){
                    vis[nums.get(j)] = true;
                    cnt++;
                }
                res += cnt*cnt;
            }
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
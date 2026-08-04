class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        boolean[] vis = new boolean[101];
        List<Integer> res = new ArrayList<>();

        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            vis[nums[i]] = true;
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }

        for(int i=min+1 ; i<max ; i++) if(!vis[i]) res.add(i);

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
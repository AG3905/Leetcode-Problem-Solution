class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int minCount=0,taragetCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                taragetCount++;
            else if(nums[i]<target)
                minCount++;
        }
       
       if(taragetCount==0) return new ArrayList<>();
       List<Integer> ans=new ArrayList<>();
       for(int i=0;i<taragetCount;i++)
       {
          ans.add(minCount+i);
       }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
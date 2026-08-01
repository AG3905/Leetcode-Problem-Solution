class Solution {
    public boolean back(int i,int j,int[] nums,int p1,int p2,int a){
        if(i>j){
            return p1>=p2;
        }

        if((a&1)==0){
            return back(i+1,j,nums,p1+nums[i],p2,a^1) || back(i,j-1,nums,p1+nums[j],p2,a^1);
        }

        return back(i+1,j,nums,p1,p2+nums[i],a^1) && back(i,j-1,nums,p1,p2+nums[j],a^1);
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        return back(0,n-1,nums,0,0,0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
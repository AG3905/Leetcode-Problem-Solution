class Solution {
    public int smallestIndex(int[] nums) {
        int min = -1;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            while(nums[i]>0){
                int rem = nums[i]%10;
                sum +=rem*10;
                nums[i] = nums[i]/10;
            }
            if(sum/10==i){
                min = i;
                break;
            }
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
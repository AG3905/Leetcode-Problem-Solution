class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();

        while(sum>0){
            if(sum-9>0){
                sum-=9;
                sb.append(9);
            }else{
                sb.append(sum);
                sum = 0;
            }
        }
        if(sb.length()>num) return "";
        
        for(int i=sb.length() ; i<num ; i++) sb.append(0);

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
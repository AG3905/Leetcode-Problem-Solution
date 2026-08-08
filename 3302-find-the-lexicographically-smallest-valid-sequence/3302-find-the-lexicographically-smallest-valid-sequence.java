class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int last = m-1;
        int match = 0;

        int[] matchRight = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            matchRight[i] = match;
            if(last>=0 && word1.charAt(i)==word2.charAt(last)){
                last--;
                match++;
            }
        }

        int[] ans = new int[m];
        boolean changes = false;
        int j=0;
        for(int i=0 ; i<n && j<m ; i++){
            if(word1.charAt(i)==word2.charAt(j)){
                ans[j]=i;
                j++;
            }else if(!changes && matchRight[i]>=m-1-j){
                ans[j] = i;
                j++;
                changes = true;
            }
        }

        if(j==m) return ans;

        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
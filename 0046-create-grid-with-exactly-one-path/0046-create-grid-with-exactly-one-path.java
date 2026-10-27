class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<n ; i++){
            sb.append('.');
        }

        res[0] = sb.toString();
        sb = new StringBuilder();
        
        for(int i=0 ; i<n-1 ; i++){
            sb.append('#');
        }
        sb.append('.');

        for(int i=1 ; i<m ; i++) res[i] = sb.toString();

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
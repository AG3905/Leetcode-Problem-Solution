class Solution {
    public int minimumPushes(String word) {
        int[] ch = new int[26];
        for(char c : word.toCharArray()){
            ch[c-'a']++;
        }
        Arrays.sort(ch);
        int j=1;
        int res = 0;
        for(int i=25 ; i>=0 ; i--){
            if(ch[i]>0){
                res += (((j-1)/8)+1)*ch[i];
                j++;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
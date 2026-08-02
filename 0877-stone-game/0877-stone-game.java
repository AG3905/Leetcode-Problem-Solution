class Solution {
    // public boolean back(int i,int j,int[] piles,int p1,int p2,int turn){
    //     if(i>j){
    //         return p1>p2;
    //     }
    //     if((turn&1)==0){
    //         return back(i+1,j,piles,p1+piles[i],p2,turn^1) || back(i,j-1,piles,p1+piles[j],p2,turn^1);
    //     }

    //     return back(i+1,j,piles,p1,p2+piles[i],turn^1) && back(i,j-1,piles,p1,p2+piles[j],turn^1);
    // }
    public boolean stoneGame(int[] piles) {
        // int n = piles.length;

        // return back(0,n-1,piles,0,0,0);

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
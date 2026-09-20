/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int h = n;

        // int ans = n;
        while(l<h){
            int mid = l + (h - l) / 2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                h = mid;
            }else{
                l = mid+1;
            }
        }

        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
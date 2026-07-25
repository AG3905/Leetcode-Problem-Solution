class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(n>0){
            pq.add(n%10);
            n /= 10;
        }

        int n1 = pq.remove();
        
        return pq.remove()*n1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
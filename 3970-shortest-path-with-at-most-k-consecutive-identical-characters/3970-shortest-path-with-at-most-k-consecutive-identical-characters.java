class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<List<int[]>> grp = new ArrayList<>();
        
        for(int i=0 ; i<n ; i++) grp.add(new ArrayList<>());

        for(int[] e : edges){
            grp.get(e[0]).add(new int[]{e[1],e[2]});
        }

        int[] best = new int[n];
        Arrays.fill(best,k+1);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Arrays::compare);
        pq.add(new int[]{0,1,0});

        while(!pq.isEmpty()){
            int[] p = pq.poll();
            int d = p[0];
            int run = p[1];
            int node = p[2];

            if(run>=best[node]) continue;
            if(node==n-1) return d;

            best[node] = run;
            for(int[] e : grp.get(node)){
                int y = e[0];
                int r = labels.charAt(y)==labels.charAt(node)?run+1:1;
                if(r<best[y]) pq.add(new int[]{d+e[1],r,y});
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
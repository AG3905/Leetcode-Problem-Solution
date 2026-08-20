class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0 ; i<=n ; i++) list.add(new ArrayList<>());

        for(int[] e : edges){
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }

        HashSet<Integer> set = new HashSet<>();
        int[] visit = new int[n+1];
        int[] timearr = new int[n+1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,0});

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                int[] cur = q.poll();

                int next = 0;
                int light = cur[1]/change;
                if(light%2==0){
                    next = cur[1]+time;
                }else next = (light+1)*change+time;

                for(int nextNode:list.get(cur[0])){
                    if(visit[nextNode]<2 && timearr[nextNode]<next){
                        q.offer(new int[]{nextNode,next});
                        visit[nextNode]++;
                        timearr[nextNode]=next;
                        if(nextNode==n && visit[nextNode]==2) return next; 
                    }    
                }

            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
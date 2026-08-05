class Solution {

    void dfs(int u, boolean[] vis, List<List<Integer>> graph) {

        vis[u] = true;

        for (int v : graph.get(u)) {
            if (!vis[v])
                dfs(v, vis, graph);
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] e : invocations)
            graph.get(e[0]).add(e[1]);

        boolean[] suspicious = new boolean[n];

        dfs(k, suspicious, graph);

        for (int[] e : invocations) {

            int u = e[0];
            int v = e[1];

            if (!suspicious[u] && suspicious[v]) {

                List<Integer> ans = new ArrayList<>();

                for (int i = 0; i < n; i++)
                    ans.add(i);

                return ans;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!suspicious[i])
                ans.add(i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
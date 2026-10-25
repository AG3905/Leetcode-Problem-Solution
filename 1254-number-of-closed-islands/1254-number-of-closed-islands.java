
class Solution {
    boolean[][] vis;
    static int n, m;

    public void dfs(int[][] grid, boolean[][] vis, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m
                || vis[i][j] || grid[i][j] == 1) {
            return;
        }

        vis[i][j] = true;

        dfs(grid, vis, i + 1, j);
        dfs(grid, vis, i - 1, j);
        dfs(grid, vis, i, j + 1);
        dfs(grid, vis, i, j - 1);
    }

    public int closedIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        vis = new boolean[n][m];
        int cnt = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < m; j++) {
                int row = i * (n - 1);

                if (grid[row][j] == 0 && !vis[row][j]) {
                    dfs(grid, vis, row, j);
                }
            }

            for (int j = 1; j < n - 1; j++) {
                int col = i * (m - 1);

                if (grid[j][col] == 0 && !vis[j][col]) {
                    dfs(grid, vis, j, col);
                }
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (grid[i][j] == 0 && !vis[i][j]) {
                    cnt++;
                    dfs(grid, vis, i, j);
                }
            }
        }

        return cnt;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
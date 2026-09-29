class Solution {
    int n, m;
    Boolean[][][] dp;

    public boolean dfs(char[][] grid, int i, int j, int cnt) {
        if (i >= n || j >= m) {
            return false;
        }

        if (grid[i][j] == '(') {
            cnt++;
        } else {
            cnt--;
        }

        if (cnt < 0) {
            return false;
        }

        int remaining = (n - 1 - i) + (m - 1 - j);

        if (cnt > remaining) {
            return false;
        }

        if (i == n - 1 && j == m - 1) {
            return cnt == 0;
        }

        if (dp[i][j][cnt] != null) {
            return dp[i][j][cnt];
        }

        boolean down = dfs(grid, i + 1, j, cnt);
        boolean right = dfs(grid, i, j + 1, cnt);

        return dp[i][j][cnt] = down || right;
    }

    public boolean hasValidPath(char[][] grid) {

        n = grid.length;
        m = grid[0].length;

        if ((n + m) % 2 == 0) {
            return false;
        }
        if (grid[0][0] == ')') {
            return false;
        }
        if (grid[n - 1][m - 1] == '(') {
            return false;
        }

        dp = new Boolean[n][m][n + m];

        return dfs(grid, 0, 0, 0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
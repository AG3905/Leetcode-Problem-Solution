class Solution {
    public int minMoves(String[] classroom, int energy) {
        int n = classroom.length;
        int m = classroom[0].length();

        int sr=-1, sc=-1;
        int cnt = 0;

        int[][] id = new int[n][m];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(classroom[i].charAt(j)=='S'){
                    sr = i;
                    sc = j;
                }
                if(classroom[i].charAt(j)=='L'){
                    id[i][j] = cnt++;
                }
            }
        }

        int mask = 1<<cnt;
        int fullmask = mask-1;

        int[][][] best = new int[n][m][mask];
        for(int[][] layer : best) for(int[] r : layer) Arrays.fill(r,-1);
        
        int e = energy;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc,0,e,0});
        int[][] dir = {{-1,1,0,0},{0,0,-1,1}};

        while(!q.isEmpty()){
            int[] p = q.remove();
            int r = p[0];
            int c = p[1];
            int ma = p[2];
            int ene = p[3];
            int step = p[4];

            if(ma==fullmask){
                return step;
            }

            if(ene==0) continue;


            for(int i=0 ; i<dir[0].length ; i++){
                int nr = r + dir[0][i];
                int nc = c + dir[1][i];

                if(nr<0 || nc<0 || nr>=n || nc>=m) continue;

                if(classroom[nr].charAt(nc)=='X'){
                    continue;
                }

                int newEn = ene-1;
                int newMask = ma;

                if(classroom[nr].charAt(nc)=='L'){
                    newMask |= (1<<id[nr][nc]);
                }

                if(classroom[nr].charAt(nc)=='R'){
                    newEn = energy;
                }

                if(best[nr][nc][newMask]>=newEn){
                    continue;
                }

                best[nr][nc][newMask]=newEn;
                q.offer(new int[]{nr,nc,newMask,newEn,step+1});
            }
        } 

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
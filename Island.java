package Daily_Problem;
import java.util.LinkedList;
import java.util.Queue;

public class Island {
    static int[][] a = {{0,1,1,0},{0,1,1,0},{0,0,1,0},{0,0,0,0},{1,1,0,1}};
    static int[][] vis=new int[a.length][a[0].length];
    static class Pair{
        int row;
        int col;
        Pair(int r, int c){
            this.row = r;
            this.col = c;
        }
    }
    public static void bfs(int i,int j,int[][] ori,int[][] vis)
    {
        int n = ori.length;
        int m = ori[0].length;
        vis[i][j]=1;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        Queue<Island.Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for(int k = 0; k<4; k++){
                int nrow = r + drow[k];
                int ncol = c + dcol[k];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol<m && vis[nrow][ncol] == 0 && ori[nrow][ncol] == 1){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }
    }
    public static int island(int[][] grid) {
       int count=0;
        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0) {
                    count++;
                    bfs(i, j, grid, vis);
                }
            }
        }
        return count;
    }
public static void main(String[] args) {
    System.out.println(island(a));
}
}

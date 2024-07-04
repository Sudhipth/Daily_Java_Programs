package Daily_Problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj)
    {
       ArrayList<Integer> bf=new ArrayList<>();
       boolean bol[]=new boolean[v];
       Queue<Integer> q=new LinkedList<>();
       q.add(0);
       bol[0]=true;
       while(!q.isEmpty())
       {
           int n=q.poll();
           bf.add(n);
           for(int i:adj.get(n))
           {
               if(bol[i]==false)
               {
                   bol[i]=true;
                   q.add(i);
               }
           }
       }
       return bf;
    }
    public static void main(String[] args) {
          ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
          for(int i=1;i<=5;i++)
          {
              adj.add(new ArrayList<>());
          }
          adj.get(0).add(1);
          adj.get(1).add(0);
          adj.get(0).add(4);
          adj.get(4).add(0);
          adj.get(1).add(3);
          adj.get(3).add(1);
          adj.get(1).add(2);
          adj.get(2).add(1);

          ArrayList<Integer> ans=bfs(5,adj);
          for(int i=0;i<ans.size();i++)
          {
              System.out.println(ans.get(i)+" ");
          }

    }
}

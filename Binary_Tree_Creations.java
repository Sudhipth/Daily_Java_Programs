package Daily_Problem.Trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Creations {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int num) {
            this.data = num;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    public static Node buildtree(int[] arr) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }
        Node nn = new Node(arr[idx]);
        nn.left = buildtree(arr);
        nn.right = buildtree(arr);
        return nn;
    }

    public static void preorder(Node nn) {
        if (nn == null)
            return;
        System.out.print(nn.data + " ");
        preorder(nn.left);
        preorder(nn.right);
    }

    public static void inorder(Node nn) {
        if (nn == null)
            return;
        inorder(nn.left);
        System.out.print(nn.data + " ");
        inorder(nn.right);
    }
    public static void postorder(Node nn) {
        if (nn == null)
            return;
        postorder(nn.left);
        postorder(nn.right);
        System.out.print(nn.data + " ");
    }
    public static void levelorder(Node nn) {
        if(nn==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty())
        {
            Node n=q.poll();
            System.out.print(n.data+" ");
            if(n.left!=null)
            {
                q.add(n.left);
            }
            if(n.right!=null) {
                q.add(n.right);
            }
        }
    }
   public static List<List<Integer>> zigzag(Node nn)
   {
       List<List<Integer>> ans=new LinkedList<>();
       if(nn==null)
           return ans;
       Queue<Node> q=new LinkedList<>();
       q.add(nn);
       boolean b=true;
       while(!q.isEmpty())
       {
           int size=q.size();
           List<Integer> l=new LinkedList<>();
           for (int i=0;i<size;i++)
           {
                Node n=q.poll();
                l.add(n.data);
               if(n.left!=null)
               {
                   q.add(n.left);
               }
               if(n.right!=null) {
                   q.add(n.right);
               }
           }
           if(!b) {
               Collections.reverse(l);
           }
           ans.add(l);
           b = !b;
       }
       return ans;
   }
   public static void print(List<List<Integer>> ans)
   {
       for(List<Integer> i:ans)
       {
           for(int j:i)
           {
               System.out.print(j+" ");
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildtree(arr);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.print("Level Order : ");
        levelorder(root);
        System.out.println();
        List<List<Integer>>  ans= zigzag(root);
        print(ans);
    }
}

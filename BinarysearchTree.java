package Daily_Problem;
import java.util.*;
public class BinarysearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int n)
        {
            this.data=n;
            this.left=null;
            this.right=null;
        }
    }
    public static Node BST(int arr[],int s,int e)
    {
        if (s > e) {
            return null;
        }
        int mid = (s + e) / 2;
        Node node = new Node(arr[mid]);
        node.left = BST(arr, s, mid - 1);
        node.right = BST(arr, mid + 1, e);
        return node;
    }
    public static void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }System.out.println("|------>"+node.data);
        }
        else{
            System.out.println(node.data);
        }
        display(node.left, level + 1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int start=0;
        int end=arr.length-1;
        Node nn= BST(arr,start,end);
        display(nn, 0);

    }
}

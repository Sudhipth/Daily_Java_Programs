package Daily_Problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree {
static Queue<Integer> que=new LinkedList<>() ;

	static class Node{
    	int data;
    	Node left;
    	Node right;
       
    	public Node(int num)
    	{
    		this.data=num;
    		this.left=null;
    		this.right=null;
    	}
    }
    static class BinaryTree
    {
    	static int index=-1;
    	public static Node Buildtree(int arr[])
    	{
    		index++;
    		if(arr[index]==-1)
			return null;
    		
    		Node nn=new Node(arr[index]);
    		nn.left= Buildtree(arr);
    		nn.right= Buildtree(arr);
    		return nn;
    	}
    }
	public static void main(String[] args) {
		int arr[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree obj=new BinaryTree();
		Node ans= new Node(1);
		ans.left=new Node(2);
		ans.right=new Node(3);
		ans.left.left=new Node(4);
		ans.left.right=new Node(5);
		ans.right.left=new Node(6);
		ans.right.right=new Node(7);
		System.out.println("PREORDER : ");
		preorder(ans);
		System.out.println();
		System.out.println("POSTORDER : ");
		postorder(ans);
		System.out.println();
		System.out.println("InOrder : ");
		inorder(ans);
		System.out.println();
		System.out.println("LEVELORDER : ");
		que.add(ans.data);
		levelorder(ans);
		System.out.println(que);
        levelprint(1);

	}

	private static void levelprint(int n) {
		for(int i=0;i<n;i++)
		{
			if(que.isEmpty())
				return;
			System.out.print(que.poll()+ " ");
		}
		System.out.println();
		levelprint(n*2);
	}

	private static void levelorder(Node ans) {

		if(ans.left!=null)
		{
			que.add(ans.left.data);
		}
		else
			return;
		if(ans.right!=null)
		{
			que.add(ans.right.data);
		}
		else
			return;
		levelorder(ans.left);
		levelorder(ans.right);
	}

	private static void inorder(Node ans) {
		if(ans==null)
			return;

		inorder(ans.left);
		System.out.print(ans.data+" ");
		inorder(ans.right);

	}

	private static void postorder(Node ans) {
		if(ans==null)
			return;

		postorder(ans.left);
		postorder(ans.right);
		System.out.print(ans.data+" ");

	}
	private static void preorder(Node ans) {
		if(ans==null)
			return;
		System.out.print(ans.data+" ");
		preorder(ans.left);
		preorder(ans.right);
	}

}

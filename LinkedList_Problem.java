package Daily_Problem;
import java.util.Stack;
public class LinkedList_Problem {

	class Node{
		int data;
		Node next;
		public void reverse() {
			// TODO Auto-generated method stub
			
		}
	}
	public Node head;
	public static Node tail;
	public  int size=0;
	public void addlast(int data)
	{
		Node nn=new Node();
		nn.data=data;
		nn.next=null;
		if(size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else
		{
			this.tail.next=nn;
			this.tail=nn;
			size++;
		}
	}
	public void display() {
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void reverse()
	{
		Node temp=this.head;
		Stack<Integer> st=new Stack<>();
		while(temp!=null)
		{
			st.push(temp.data);
			temp=temp.next;
		}
		while(!st.isEmpty())
		{
			System.out.print(st.pop()+" ");
		}
	}
	public static void main(String[] args) {
		LinkedList_Problem obj=new LinkedList_Problem();
		obj.addlast(1);
		obj.addlast(2);
		obj.addlast(3);
		obj.addlast(4);
		obj.display();
		obj.reverse();
	}

}

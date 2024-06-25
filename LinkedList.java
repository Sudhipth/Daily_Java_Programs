package Daily_Problem;

public class LinkedList {
 class Node{
	 int data;
	 Node next;
 }
   public int size=0;
   public Node head;
   public  Node tail;

 public  void addLast(int data)
 {
	 Node nn=new Node();
	 nn.data=data;
	 nn.next=null;
	 if(size>=1)
	 {
		 this.tail.next=nn;
	 }
	 if(this.size==0)
	 { 
		 this.size++;
		 this.head=nn;
		 this.tail=nn;
	 }
	 else
	 {
		 this.size++;
		 this.tail=nn;
	 }
 }
 public void dispaly() {
	 Node temp=this.head;
	 while(temp!=null)
	 {
		 System.out.println(temp.data);
		 temp=temp.next;
	 }
 }
 public void addFirst(int data)
 {
	 Node nn=new Node();
	 nn.data=data;
	 nn.next=null;
	 if(this.size>=1)
	 {
		 nn.next=this.head;
		 this.head=nn;
	 }
 }
	public static void main(String[] args) {
		LinkedList obj=new LinkedList();
		obj.addLast(1);
		obj.addLast(3);
		obj.addLast(4);
		obj.addLast(6);
		obj.addLast(7);
		obj.addFirst(9);
        obj.dispaly();
	}

}

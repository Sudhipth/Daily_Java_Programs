package Daily_Problem;

import java.util.Stack;

public class Stack_Greater {

	   static Stack<Integer> ori=new Stack<>();
	   static Stack<Integer> ans=new Stack<>();
	   static Stack<Integer> stack=new Stack<>();
	   public static void greater(int current)
	   {
		   if(stack.isEmpty())
		   {
			   ans.push(-1);
			   return;
		   }
		   int num1=stack.pop();
		   if(stack.isEmpty())
		   {
			   ans.push(-1);
			   return;
		   }
		   int num2=stack.peek();
		   if(num1 < num2)
		   {
			   ans.push(num2);
		   }
		   else
		   {
			   ans.push(-1);
		   }
		   greater(current+1);
	   }
	   
	   
		public static void main(String[] args) {
			ori.push(6);
			ori.push(8);
			ori.push(0);
			ori.push(1);
			ori.push(3);
			int s=ori.size();
			for(int i=0;i<s;i++)
			{
				stack.push(ori.pop());
			}
			System.out.println("Original Stack : "+ stack);
			int size=stack.size();
			greater(0);
			System.out.println("  Stack : "+ ans);
		

	}

}

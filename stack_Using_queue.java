package Daily_Problem;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class stack_Using_queue {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Stack<Integer> stack1 =new Stack<>();
        Stack<Integer> stack2 =new Stack<>();
        Queue<Integer> que=new LinkedList<>();
        for(int i:arr)
            stack1.push(i);
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        while(!stack2.isEmpty())
            que.add(stack2.pop());
        System.out.print(que);
    }
}

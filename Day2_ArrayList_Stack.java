package Daily_Problem;
import java.util.Stack;
import java.util.*;
public class Day2_ArrayList_Stack {
    
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> ch = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            ch.push(s.charAt(i));
        }
        for (int i = 0 ; i < s.length() ; i++){
            System.out.print(ch.peek());
            ch.pop();
        }
    }

}

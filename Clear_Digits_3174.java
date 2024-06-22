package Daily_Problem;
import java.util.Stack;
public class Clear_Digits_3174 {

	public static void main(String[] args) {
		 Stack<Character> st=new Stack<>();
		 String s="rtyu456";
	        for(int i=0;i<s.length();i++)
	        {
	            if(!st.isEmpty())
	            {
	                if(Character.isDigit(s.charAt(i)))
	                st.pop();
	                 else
	                st.push(s.charAt(i));
	            }
	            else
	            st.push(s.charAt(i));
	        }
	        StringBuilder str = new StringBuilder();
	        if(!st.isEmpty())
	        {
	        for(int i=st.size();i>0;i--)
	        {
	           str.append(st.pop());
	        }
	        }
	         System.out.println(str.reverse().toString());
	}

}

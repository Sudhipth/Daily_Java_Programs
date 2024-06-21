package Daily_Problem;
import java.util.ArrayList;

public class Day2_ArrayList_Sting_Parenthisis {
    static ArrayList<String> s = new ArrayList<>();
    public static void printSub(int n ,int open,int close, String ans) {
    	 if(open>n || close>n)
         	return;
        if(ans.length() == n*2){
            s.add(ans);
            return;
        }
        printSub(n,open+1,close,ans+"(");
        if(open>close)
        {
        printSub(n,open,close+1,ans+")");
        }
    }
    public static void main(String[] args) {
        printSub(3,0,0 , "");
        System.out.println(s);
    }

}

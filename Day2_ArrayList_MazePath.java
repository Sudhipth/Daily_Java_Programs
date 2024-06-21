package Daily_Problem;
import java.util.*;
public class Day2_ArrayList_MazePath {
  static ArrayList<String> list=new ArrayList<>();
	public static void main(String[] args) {
         path(2,0,0, "");
         System.out.println(list);
         System.out.println(list.size());
         }

	public static void path(int n, int row, int col, String str) {
		if(row==n && col==n )
		{
			list.add(str);
			return;
		}
		if(row>n ||col>n)
			return;
		
		path(n,row,col+1,str=str+"H");
		path(n,row+1,col,str=str+"V");
		path(n,row+1,col+1,str=str+"D");
	}

}

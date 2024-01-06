package Daily_Problem;
import java.util.ArrayList;
import java.util.*;
public class Day6_Arraylist {
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>(2);
		for(int i=0;i<5;i++)
		{
			list.add(in.nextInt());
		}
		System.out.println(list);
	}

}

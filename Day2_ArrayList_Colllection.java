package Daily_Problem;
import java.util.*;
public class Day2_ArrayList_Colllection {

	public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(0);
		list.set(0, "Rupa Bro");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}

package Daily_Problem;
import java.util.*;
public class Day1_Prime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int num=sc.nextInt();
		int c=2;
		if(num<=1)
			System.out.print("Neiter Prime nor Composite");
		while(c*c <=num)
		{
			if(num%c==0)
			{
			System.out.println("not a Prime Number");
			System.exit(0);;
			}
			c+=1;
		}
		
		System.out.print("Prime Number ");
		sc.close();
	}
}

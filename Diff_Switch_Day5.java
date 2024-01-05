package Daily_Problem;
import java.util.Scanner;
public class Diff_Switch_Day5 {

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Day in Number : ");
		int day= in.nextInt();
		switch(day)
		{
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tueday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
        default -> System.out.println("Enter the proper value ");
		}
		in.close();
	}
}

package Daily_Problem;
import java.util.Scanner;

public class Calcultor_Day4 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int ans=0;
			while(true)
			{
				System.out.print("Enter the Operator : ");
				char ch=sc.next().trim().charAt(0);
				if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%')
				{
					System.out.print("Number 1 : ");
					int num1=sc.nextInt();
					System.out.print("Number 2 : ");
					int num2=sc.nextInt();
					if(ch=='+')
					{
						ans=num1+num2;
					}
					if(ch=='-')
					{
						ans=num1-num2;
					}
					if(ch=='*')
					{
						ans=num1*num2;
					}
					if(ch=='/')
					{
						if(num2>0)
						ans=num1/num2;
					}
					if(ch=='%')
					{
						ans=num1%num2;
					}
					
				}
				else if(ch=='X' || ch=='x')
				{
					System.out.println("the Operation was closed");
					break;
				}
				else
				{
					System.out.println("Invalid Operator !!");
					break;
				}
				System.out.println(ans);
				System.out.println("Another Operation again ");
			}
		}
}


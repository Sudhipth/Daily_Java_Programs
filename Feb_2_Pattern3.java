package Daily_Problem;

import java.util.Scanner;

public class Feb_2_Pattern3 {
  public static void main(String[] args)
  {
	  System.out.println("enter how many row needed : ");
	  Scanner sc=new Scanner(System.in);
	  int row=sc.nextInt();
	  pattern1(row);
  }
  	static void pattern1(int r)
  	{
  		for(int i=1;i<=r;i++)
  		{
  			for(int j=1;j<=r-i+1;j++)
  			{
  				System.out.print("*");
  			}
  			System.out.println();
  		}
  	}
}

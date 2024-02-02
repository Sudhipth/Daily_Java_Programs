package Daily_Problem;

import java.util.Scanner;

public class Feb_2_Pattern4 {
  public static void main(String[] args)
  {
	  System.out.println("enter how many row needed : ");
	  Scanner sc=new Scanner(System.in);
	  int row=sc.nextInt();
	  pattern1(row);
  }
  	static void pattern1(int r)
  	{
  		for(int row=1;row<=r;row++)
  		{
  			for(int col=1;col<=row;col++)
  			{
  				System.out.print(col);
  			}
  			System.out.println();
  		}
  	}
}

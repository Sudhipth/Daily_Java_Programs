package Daily_Problem;

public class Recursion_Basics {
  static int sum=0;
	public static void main(String[] args) {
      int a=  recursion(5);   
	   System.out.println(a);  
	}

	public static int recursion(int i) {
		if(i==1)
			return 1;
		int sum=i+recursion (i-1);
		return sum;
		
	}

}

package Daily_Problem;

public class Recursive_palindrom {

	public static void main(String[] args) {
		String str="madam";
		palin(str,0,str.length()-1);
	}

	public static void palin(String str,int i,int j) {
       if(i>j)
       {
    	   System.out.println("Palindrom");
    	   return;
       }
       if(str.charAt(i)!=str.charAt(j))
       {
    	   System.out.print("False");
    	   return;
       }
       palin(str,i+1,j-1);
	}
}

package Daily_Problem;

public class Day7_Problem {
    public static void main(String[] args) {
    	 int[] arr = {12,3,4,58,5,55,44,66,4224,43,2};
  	   int min=arr[0];
  	   for (int i=0;i<arr.length;i++)
  	   {
  		   if(min>arr[i])
  			   min=arr[i];
  	   }
  	   System.out.println("Minimum in the Array : "+min);
    }
}

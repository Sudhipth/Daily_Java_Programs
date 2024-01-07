package Daily_Problem;

public class Day7_Min_Array {
	public static void main(String[] args)
	{
	 int[] arr = {12,3,4,58,5,55,44,66,4224,43,2};
	   int max=arr[0];
	   for (int i=0;i<arr.length;i++)
	   {
		   if(max<arr[i])
			   max=arr[i];
	   }
	   System.out.println("Maximum in the Array : "+max);
	}
}

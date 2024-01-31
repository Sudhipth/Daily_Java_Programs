package Daily_Problem;

import java.util.Arrays;

public class Day0_Selectionsort {
	 public static void main(String[] args) {
		 int[] arr = {5, 3, 4, 1, 2};
		 selectionsort(arr);
		 System.out.println(Arrays.toString(arr));
		 }

	  static int[] selectionsort(int[] arr)
	  {
	      
		  for(int i=0;i<arr.length;i++)
		  {
			  int max=0;
			  for(int j=0;j<=arr.length-1-i;j++)
			  {
				  if(arr[max]<arr[j])
				  {
					  max=j;
				  }
			  }
			  int temp=arr[max];
			  arr[max]=arr[arr.length-1-i];
			  arr[arr.length-1-i]=temp;
		  }
		  return arr;
	  }
	}


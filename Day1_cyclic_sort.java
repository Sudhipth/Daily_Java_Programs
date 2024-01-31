package Daily_Problem;

import java.util.Arrays;

public class Day1_cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
        	int correct=arr[i]-1;
        	if(arr[i]!=arr[correct])
        	{
        		int t=arr[i];
        		arr[i]=arr[correct];
        		arr[correct]=t;
        	}
        	else
        		i++;
        }
    }
}

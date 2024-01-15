package Daily_Problem;

public class Day15_BinarySearch {

	public static void main(String[] args) {
		int[] arr= {12,33,44,355,535,555,664,757,888};
		int target=664;
		System.out.println(binarysearch(arr,target));

	}
	static int binarysearch(int arr[],int target)
	{
		int start=0;
		int end =arr.length-1;
        boolean isAs=arr[start]>arr[end];
        while(start<=end)
        {
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        	return mid;
        if(isAs)
        {
        	if(arr[mid]>target)
        		start=mid+1;
        	else
        		end=mid-1;
        }
        else
        {
        	if(arr[mid]<target)
        		start=mid+1;
        	else
        		end=mid-1;
        }
        }
        return -1;    
	}
}

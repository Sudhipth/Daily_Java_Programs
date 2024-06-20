package Daily_Problem;

public class Target_recursion {

	public static void main(String[] args) {
        int arr[]= {1,2,3,4,1,8};
        int len=1;
		array(arr,len);
	}

	public static void array(int[] arr, int len) {
        
		if(len==arr.length)
		{
			System.out.print("true");
			return;
		}
		if(arr[len-1]>arr[len])
		{
			System.out.print("false");
			return;
		}
		array(arr,len+1);
	}

}

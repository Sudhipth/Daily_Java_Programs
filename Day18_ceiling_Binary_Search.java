package Daily_Problem;

public class Day18_ceiling_Binary_Search {
	public static void main(String[] args) {
		int[] arr= {12,33,44,355,535,555,664,757,888};
		int target=663;
		System.out.println(ceiling(arr,target));

	}
	static int ceiling(int arr[], int target) {
	    int start = 0;
	    int end = arr.length - 1;

	    while (start <= end) {
	        int mid = start + (end - start) / 2;

	        if (arr[mid] == target)
	            return mid;

	        boolean isAs = arr[start] < arr[mid];

	        if (isAs) {
	            if (arr[mid] < target)
	                start = mid + 1;
	            else
	                end = mid - 1;
	        } else {
	            if (arr[mid] > target)
	                start = mid + 1;
	            else
	                end = mid - 1;
	        }
	    }

	    return start;
	}
}

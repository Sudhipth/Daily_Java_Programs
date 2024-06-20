package Daily_Problem;

public class Subset_Recursive {
  
	public static void findDubdets(int[] arr,int idx,String set,int sum_so_far,int tar)
	{
		if(tar== sum_so_far)
		{
			System.out.println(set);
			return ;
		}
		if(idx==arr.length)
		{
			return;
		}
		if(sum_so_far>tar)
		{
			return;
		}
		findDubdets(arr,idx+1,set+arr[idx]+" ",sum_so_far+arr[idx],tar);
		findDubdets(arr,idx+1,set,sum_so_far,tar);
	}
	public static void main(String[] args) {
		int arr[]= {2,4,6,8};
		int targetSum=12; 
		findDubdets(arr,0,"",0,targetSum);
	}

}

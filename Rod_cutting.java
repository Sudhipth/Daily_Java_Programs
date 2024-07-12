package Daily_Problem;

public class Rod_cutting {
    public static void main(String[] args) {
        int arr[]={0,1,5,8,9,10,17,17,20};
        System.out.println(rod(arr,arr.length-1));
    }
    public static int rod(int arr[],int n)
    {
        int max=arr[n];
        int left=1;
        int right=n-1;
        while(left<=right)
        {
            int fp=rod(arr,left);
            int sp=rod(arr,right);
            int tot=fp+sp;
            if(tot>max)
                max=tot;
            left++;
            right--;
        }
        return max;
    }
}

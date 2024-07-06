package Daily_Problem;

public class Merging {
    public static void main(String[] args) {
        int arr1[]={10 ,40,50,80,90,100};
        int arr2[]={20,30,60};
        int ans[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
                if(arr1[i]>arr2[j])
                {
                    ans[k]=arr2[j];
                    k++;
                    j++;
                }
                else
                {
                    ans[k]=arr1[i];
                    i++;
                    k++;
                }
              if(i==arr1.length)
              {
                  while(j<arr2.length)
                  {
                      ans[k]=arr2[j];
                      k++;
                      j++;
                  }
              }
            if(j==arr2.length)
            {
                while(i<arr1.length)
                {
                    ans[k]=arr1[i];
                    k++;
                    i++;
                }
            }
        }
        for(int z:ans)
        {
            System.out.print(z+" ");
        }
    }
}

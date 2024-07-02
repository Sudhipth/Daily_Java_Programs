package Daily_Problem;

public class Bubble_Sort {
    public static void main(String[] args) {
        int A[]={12,25,5,88,85,55,51};
        int n= A.length;
        for(int k = 0; k< n-1; k++) {
            for(int i = 0; i < n-k-1; i++) {
                if(A[ i ] > A[ i+1] ) {
                    int temp = A[ i ];
                    A[ i ] = A[ i+1 ];
                    A[ i + 1] = temp;
                }
            }
        }
        for(int i:A)
        {
            System.out.print(i+" ");
        }
    }
}

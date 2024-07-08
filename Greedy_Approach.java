package Daily_Problem;

public class Greedy_Approach {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5,};
        int end[]={2,4,6,7,9,9};
        int count=1;
        int last=end[0];
        for(int i=1;i<start.length;i++)
        {
            if(start[i]>=last)
            {
                count++;
                last=end[i];
            }
        }
        System.out.println(count);
    }
}

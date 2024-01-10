package Daily_Problem;

public class Day10_Max_in_2Darray {

	public static void main(String[] args) {
		 int [][] accounts= { {323,4,43,4},{54,4,3,2},{33,4,43,23}};
		          int ans=0;
		        for(int i=0;i<accounts.length;i++)
		        {
		               int sum =0;
		            for(int j=0;j<accounts[i].length;j++)
		            {
		                sum+=accounts[i][j];
		            } 
		        if(sum>ans){
		           ans=sum;
		          }
		        }
		        System.out.println( ans);
		    }
	}

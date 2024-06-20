package Daily_Problem;

public class UniquePath_Recursive {

	   public static void path(int n , int row, int col , String ans){
	        if(row == n && col == n){
	            System.out.println(ans);
	            return;
	        }
	        if(row > n || col > n){
	            return;
	        }
	        path(n , row , col + 1 , ans + "H");
	        path(n , row + 1 , col , ans + "V");
	    }

	    public static void main(String[] args) {
	        path(2 , 0, 0 ,"");
	    } 
}

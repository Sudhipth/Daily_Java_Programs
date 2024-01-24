package Daily_Problem;

public class Day24_Binarry_Search2D {
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return false; 
	        }
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int start = 0;
	        int end = cols - 1; 

	        while (start < rows && end >= 0) {
	            if (target == matrix[start][end]) {
	                return true;
	            } else if (matrix[start][end] > target) {
	                end--;
	            } else {
	                start++;
	            }
	        }
	        return false;
	    }
	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 4, 7},
	            {2, 5, 8},
	            {3, 6, 9}
	        };
	        int target = 5;
	        boolean result =searchMatrix(matrix, target);
	        System.out.println(result);  
	    }
}

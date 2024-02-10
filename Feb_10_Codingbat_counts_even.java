package Daily_Problem;

public class Feb_10_Codingbat_counts_even {

	public static void main(String[] args) {
	
		        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		        // Call the countEvens method and print the result
		        int evenCount = countEvens(numbers);
		        System.out.println("Number of even elements: " + evenCount);
		    }

		    public static int countEvens(int[] nums) {
		        int count = 0;
		        for (int i = 0; i < nums.length; i++) {
		            if (nums[i] % 2 == 0)
		                count++;
		        }
		        return count;
		    }

	}


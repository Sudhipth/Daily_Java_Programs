package Daily_Problem;

public class Feb_13_Codingbat {

	 public static void main(String[] args) {
	        // Example array
	        int[] exampleArray1 = {1, 2, 2, 3, 4, 4, 5};
	        int[] exampleArray2 = {1, 2, 3, 4, 5};

	        Feb_13_Codingbat myInstance = new Feb_13_Codingbat();

	        boolean result1 = myInstance.either24(exampleArray1);
	        System.out.println("Result for exampleArray1: " + result1);

	        boolean result2 = myInstance.either24(exampleArray2);
	        System.out.println("Result for exampleArray2: " + result2);
	    }

	    public boolean either24(int[] nums) {
	        int count = 0;
	        for (int i = 0; i < nums.length - 1; i++) {
	            if (nums[i] == 2 && nums[i + 1] == 2)
	                count++;
	            if (nums[i] == 4 && nums[i + 1] == 4)
	                count++;
	        }
	        return count == 1;
	    }

}

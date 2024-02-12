package Daily_Problem;

public class Feb_12_Codingbat {

	public static void main(String[] args) {
        // Example usage
        int[] exampleArray1 = {1, 2, 1, 3};
        int value1 = 1;
        System.out.println(isEverywhere(exampleArray1, value1)); // Output: true

        int[] exampleArray2 = {1, 2, 1, 3};
        int value2 = 2;
        System.out.println(isEverywhere(exampleArray2, value2)); // Output: false
    }

    public static boolean isEverywhere(int[] nums, int val) {
        boolean result = true;
        for (int i = 0; i <= nums.length - 2; i++) {
            if (!(nums[i] == val || nums[i + 1] == val)) {
                result = false;
                break;  // Added break to exit the loop once result is set to false
            }
        }
        return result;
    }

}

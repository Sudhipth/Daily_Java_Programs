package Daily_Problem;
import java.util.HashMap;
import java.util.Map;


public class Feb_4_TwoSum {

	public static void main(String[] args) {
		
		    	Feb_4_TwoSum solution = new Feb_4_TwoSum();
		        int[] nums = {2, 7, 11, 15};
		        int target = 9;
		        int[] result = Feb_4_TwoSum.twoSum(nums, target);
		        if (result[0] != 0 || result[1] != 0) {
		            System.out.println("Indices of the two numbers that add up to the target:");
		            System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
		        } else {
		            System.out.println("No solution found.");
		        }
		    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

	}


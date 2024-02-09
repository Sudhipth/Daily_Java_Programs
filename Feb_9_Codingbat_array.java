package Daily_Problem;

public class Feb_9_Codingbat_array {

	
	    public static void main(String[] args) {
	        int[] exampleArray = {1, 7, 1, 1, 7};

	        boolean result = has77(exampleArray);

	        System.out.println("Result: " + result);
	    }

	    public static boolean has77(int[] nums) {
	    	  int len=nums.length;
	    	  for(int i=0;i<len-2;i++)
	    	  {
	    	    for(int j=0;j<len-1;j++)
	    	    {
	    	    if(nums[j]==7 && nums[j+1]==7)
	    	    return true;
	    	    else if(nums[i]==7 && nums[i+2]==7)
	    	    return true;
	    	    }
	    	  }
	    	  return false;
	    	}

	}




package Daily_Problem;

public class ValidWord_3136 {
	  public static boolean isValid(String word) {
	        int[] arr = new int[2];

	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
	                    || c == 'U') {
	                arr[0]++;
	            } else if (Character.isLetter(c))
	                arr[1]++;
	            else if (Character.isDigit(c)) {
	            } else
	                return false;
	        }
	        int count = 0;
	        for (int i : arr) {
	            if (i >= 1)
	                count++;
	        }
	        if (word.length() > 2)
	            return count == 2;
	        return false;
	    }
	  public static void main(String[] args)
	  {
		  System.out.println(isValid("234Adas"));
	  }
}

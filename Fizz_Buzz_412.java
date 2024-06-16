package Daily_Problem;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz_412 {

    public static void main(String[] args) {
        Solution solution = new Fizz_Buzz_412().new Solution();
        List<String> result = solution.fizzBuzz(15);
        System.out.println(result);
    }

    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> str=new ArrayList<>();
            for(int i=1;i<=n;i++)
            {
                if(i%3==0 && i%5==0)
                    str.add("FizzBuzz");
                else if(i%3==0)
                    str.add("Fizz");
                else if(i%5==0)
                    str.add("Buzz");
                else
                {
                    String a=String.valueOf(i);
                    str.add(a);
                }
            }
            return str;
        }
    }
}

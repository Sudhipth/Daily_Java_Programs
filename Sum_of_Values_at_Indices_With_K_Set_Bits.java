package Daily_Problem;

public class Sum_of_Values_at_Indices_With_K_Set_Bits {
	class Solution {
	    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
	        int sum=0;
	        for(int i=0;i<nums.size();i++)
	        {
	            String str = Integer.toBinaryString(i);
	            int count=0;
	            for(int j=0;j<str.length();j++)
	            {
	                if(str.charAt(j)=='1')
	                {
	                    count++;
	                }
	            }
	            if(count==k)
	            sum+=nums.get(i);
	        }
	        return sum;
	    }
	}
	//2864. Maximum Odd Binary Number
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            count++;
        }
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(i<count-1)
            str+="1";
            else if(i==s.length()-1)
            str+="1";
            else
            str+="0";
        }
        return str;
    }
}
}

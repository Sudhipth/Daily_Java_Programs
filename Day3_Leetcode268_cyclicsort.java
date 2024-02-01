package Daily_Problem;
//https://leetcode.com/problems/missing-number/description/
public class Day3_Leetcode268_cyclicsort {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int n=missingNumber(nums);
        System.out.println(n);
	}
	 public static int missingNumber(int[] nums) {
         int i = 0;
       while(i<nums.length) {
       	int correct=nums[i];
       	if(nums[i]<nums.length && nums[i]!=nums[correct])
       	{
       		int t=nums[i];
       		nums[i]=nums[correct];
       		nums[correct]=t;
       	}
       	else
       		i++;
       }
       for(int j=0;j<nums.length;j++)
       {
           if(nums[j]!=j)
           return j;
       }
       return nums.length;
   }

}

/* class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
          int i = 0;
          while(i<nums.length) {
          	int correct=nums[i]-1;
          	if(nums[i]!=nums[correct])
          	{
          		int t=nums[i];
          		nums[i]=nums[correct];
          		nums[correct]=t;
          	}
          	else
          		i++;
          }
          List<Integer> ans=new ArrayList<>();
          for(int k=0;k<nums.length;k++)
          {
              if(nums[k]!=k+1)
              ans.add(k+1);
          }
          return ans;
    }
}
*/

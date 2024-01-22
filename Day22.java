class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {
           for(int j=i+1;j<nums.length;j++)
           {
               if(nums[i]==nums[j])
               {
                   
                  arr[0]=nums[i];
                  arr[1]=nums[j]+1;
               }
           }
        }
        return arr;
    }
}

//Leetcode Set missmatch 645 problem number!!
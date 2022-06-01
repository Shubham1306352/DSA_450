class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;  
        int ans[]= new int [n];
        int num=0;
        for(int i=0;i<n;i++)
        {
            num+=nums[i];
            ans[i]=num;
            
        }
        return ans;
    }
}
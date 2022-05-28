class Solution {
    public int missingNumber(int[] nums) {
    Arrays.sort(nums);
        int missing=0;
        int length=nums.length;
        for(int i=0;i<length;i++)
        {
            if(nums[i]==i)
                continue;
            else
            {
                missing=i;
                break;   
            }
            
        }
        int j=length;
        if(nums[nums.length-1]!=j)
            return j;
        
        return missing;
        
        
        
    }
}
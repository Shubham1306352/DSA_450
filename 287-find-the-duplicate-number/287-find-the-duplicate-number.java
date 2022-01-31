class Solution {
    public int findDuplicate(int[] nums)
    {
        int index=0;
      Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
            index=i;
                break;
            }  
                
            else 
                set.add(nums[i]);
        }
        return nums[index];
    }
}   
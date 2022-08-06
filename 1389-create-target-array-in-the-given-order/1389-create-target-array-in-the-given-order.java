class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       int ans[]=new int[nums.length];
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            
            
            list.add(index[i],nums[i]);
            
            
            
        }
        for(int i=0;i<list.size();i++)
        ans[i]=list.get(i);
        
        return ans;
    }
}
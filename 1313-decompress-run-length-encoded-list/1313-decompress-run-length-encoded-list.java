class Solution {
    public int[] decompressRLElist(int[] nums) {
      
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<nums.length;i=i+2)
        {
            int value=nums[i];
            int freq=nums[i-1];
            
            for(int j=1;j<=freq;j++)
                list.add(value);
            
            
        }
        
        int ans[]=new int[list.size()];
        
        for(int i=0;i<list.size();i++)
            ans[i]=list.get(i);
        
        return ans;
        
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] arr= new int [2*n];
        
        List<Integer>list =new ArrayList<>();
     

        for(int i=0,j=n;i<n&&j<2*n;i++,j++)
        {
         list.add(nums[i])  ;
         list.add(nums[j]);
            
        }
        for(int i=0;i<2*n;i++)
        {
         arr[i]=list.get(i);
        }
        return arr;
    }
}
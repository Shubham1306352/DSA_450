class Solution {
    public List<List<Integer>> generate(int numRows) {
       
      
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
        
        
        
        
            
        

        for(int i=0;i<numRows;i++)
        {
            List<Integer>list=new ArrayList<>();
            
            
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                    list.add(1);
                else
                    list.add(res.get(j)+res.get(j-1));
                
                
            }
            
            res=list;
            ans.add(list);
            
        }
            
        return ans;
            
    }
}
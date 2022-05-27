class Solution {
    public List<List<Integer>> generate(int numRows) {
     
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        int num=0;
       
        for(int i=0;i<numRows;i++)
        {
             ArrayList<Integer>list=new ArrayList<Integer>();
            
            for(int j=0;j<i+1;j++)
            {
                if(j==0||j==i)
                list.add(1);
                   
                else
             {
               num=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
               list.add(num);    
             }
            
            }
            ans.add(list);
            
            
            
        }
        return ans;
    }
}
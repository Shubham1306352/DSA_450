class Solution {
    public String decodeMessage(String key, String message) {
      
        Map<Character,Character> map = new HashMap<>();
        char m='a';
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)==' ')
                continue;
            
            
            
            if(map.containsKey(key.charAt(i))==false)
            {
                map.put(key.charAt(i),m);
                
                int a= m;
                a++;
                m=(char)a;
                    
            }
         
    } 
    
    String ans="";
    
    for(int j=0;j<message.length();j++)
    {
       if(message.charAt(j)==' ')
           ans+=" ";
        else
            ans+=map.get(message.charAt(j));
        
    }
    
    return ans;
    }   
}
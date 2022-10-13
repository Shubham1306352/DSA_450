class Solution {
    public boolean makeEqual(String[] words) {
 Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            for(int j=0;j<str.length();j++)
            {
                if(map.containsKey(str.charAt(j))==false)
                    map.put(str.charAt(j),1);
                else
                    map.put(str.charAt(j),map.get(str.charAt(j))+1);
                
            }
            
        }
        
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            int m=entry.getValue();
            if(m%words.length!=0)
                return false;
        }
        
        return true;
        
    }
}
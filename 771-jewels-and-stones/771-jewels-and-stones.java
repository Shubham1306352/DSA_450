class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
        
            String g="";
            g+=stones.charAt(i);
            if(jewels.contains(g))
                count++;
            
            
        }
        return count;
    }
}
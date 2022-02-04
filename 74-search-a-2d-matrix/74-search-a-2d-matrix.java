class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        boolean found=false;
        int n=matrix.length;
        
        
        for(int i=0;i<n;i++)
        {
            
            
            for(int j=0;j<matrix[0].length;j++)
        {
           if(matrix[i][j]==target)
               found=true;
            
            
        }
            
            
        }
        return found;
        
    }
}
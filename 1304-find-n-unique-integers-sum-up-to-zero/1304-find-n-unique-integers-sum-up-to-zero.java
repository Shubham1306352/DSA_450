class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int count=1;
        if(n%2==0){
            
            for(int i=0;i<n;i+=2){
                arr[i]=count;
                arr[i+1]=count*-1;
                count++;
            }
        }
        else{
            arr[0]=0;
            for(int i=1;i<n;i+=2){
                arr[i]=count;
                arr[i+1]=count*-1;
                count++;
            }
        }
        return arr;
        
        
    }
}
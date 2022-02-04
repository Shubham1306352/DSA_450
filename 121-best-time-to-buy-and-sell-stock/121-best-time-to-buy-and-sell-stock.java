class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maximum = 0;
        for(int i=0;i<n;i++){
            int c = prices[i];
            while( i+1 < n && prices[i+1] >= c){
                if(prices[i+1] - c > maximum)
                    maximum = prices[i+1] - c;
                i++;
            }
        }
        return maximum;
    }
}
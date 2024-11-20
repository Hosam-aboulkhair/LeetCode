class Solution_1 {
    public int maxProfit(int[] prices) {
        int max = 0 ; 
        int min = Integer.MAX_VALUE;
        for(int i  = 0;i< prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else {
                max =  Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
// ------------------------ DP ------
public class Solution_2 {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}

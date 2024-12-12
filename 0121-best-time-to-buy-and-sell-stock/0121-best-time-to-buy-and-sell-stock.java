class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProft = 0;
        for(int i =0;i<prices.length;i++){
            minPrice = prices[i]<minPrice?prices[i]:minPrice;
            int estMaxProft =  prices[i] - minPrice;
            maxProft = estMaxProft > maxProft? estMaxProft:maxProft;
        }
        return maxProft;
    }
}
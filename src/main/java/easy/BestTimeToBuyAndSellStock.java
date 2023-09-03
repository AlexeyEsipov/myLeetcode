package easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        for (int price : prices) {
            if (min >= price) {
                min = price;
            } else if ((price - min) > result) {
                result = price - min;
            }
        }
        return result;
    }
}


public class BestTimeToBuyAndSellStockII {
    public static int profit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        System.out.println("Maximun Profit : " + profit(prices));
    }
}

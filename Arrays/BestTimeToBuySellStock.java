public class BestTimeToBuySellStock {

    public static int maxProfit(int[] price) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int p : price) {
            buy = Math.min(buy, p);
            profit = Math.max(profit, p - buy);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
}

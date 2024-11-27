public class A_19 {

    public static int maxProfit(int p[]) {
        int maxProfit = 0;
        int minSoFar = p[0];
        for (int i = 0; i < p.length; i++) {
            minSoFar = Math.min(minSoFar, p[i]);
            int profit = p[i] - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // Best time to Buy and Sell Stock
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));

    }
}

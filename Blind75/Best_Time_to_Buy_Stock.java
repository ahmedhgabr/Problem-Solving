import java.util.Arrays;

public class Best_Time_to_Buy_Stock {
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i : prices) {
            if (i < min) {
                min = i;
                max = min;
            }
            if (i > max) {
                max = i;
            }
            maxProfit = Math.max(maxProfit, max - min);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {2,4,1}; // 5
        System.out.println(maxProfit(prices));
    }

}

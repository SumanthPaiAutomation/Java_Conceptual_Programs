package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxStockProfit {

    public static void main(String[] args) {
        int[] prices = {7, 1, 2, 5, 8, 9, 1, 3};
        // output buy day : second day at price : 1
        // sell day : 6th day at price : 9
        List<Integer> lister = new ArrayList<>();
        for (int c : prices) {
            lister.add(c);
        }
        // even though min is 1, the 1 in the lower index is returned for Collections.min()
        int min_price = Collections.min(lister);
        int min_price_sell_day = lister.indexOf(min_price);
        int max_profit = Integer.MIN_VALUE;
        int diff = Integer.MIN_VALUE;
        int sell_day = 0;

        for (int i = min_price_sell_day; i < lister.size() - 1; i++) {
            for (int j = i + 1; j < lister.size(); j++) {
                diff = lister.get(j) - lister.get(i);
                if (diff > max_profit) {
                    max_profit = diff;
                    sell_day = j;
                }
            }
        }

        System.out.println("Best day to buy stock is at day " + (min_price_sell_day + 1) + " at the price : " + min_price);
        System.out.println("Best day to sell stock when bought as previous is at day " + (sell_day + 1) + " at the price : " + lister.get(sell_day));
    }
}

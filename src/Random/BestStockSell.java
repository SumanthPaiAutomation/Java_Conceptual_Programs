package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestStockSell {
    public static void main(String[] args) {
        Integer[] pricesStock = {12, 223, 23, 45, 11, 78, 90, 32, 56, 109, 45,22,67,93,12,44,109,110,34};
        //best time to buy 11-6th day
        //best time to sell 109-10th day
        //5th -12- maxday+5
        //8th-109=maxday+8th
        List<Integer> stockPrices = Arrays.asList(pricesStock);
//        Integer minStockPrice = Collections.min(stockPrices);
//        for (Integer stcPrice : stockPrices) {
//            if (stcPrice == minStockPrice) {
//                minDay = stockPrices.indexOf(stcPrice);
//            }
//        }
//        int max = 0;
//        for (int i = minDay; i < stockPrices.size(); i++) {
//            if (stockPrices.get(i) > max) {
//                max = stockPrices.get(i);
//            }
//
//        }
        //int j=0;
        int minDay=0;
        while (minDay<stockPrices.size()){
            Integer minStockPrice = Collections.min(stockPrices);
            for (Integer stcPrice : stockPrices) {
                if (stcPrice == minStockPrice) {
                    minDay = stockPrices.indexOf(stcPrice);
                }
            }
            int max = 0;
            for (int i = minDay; i < stockPrices.size(); i++) {
                if (stockPrices.get(i) > max) {
                    max = stockPrices.get(i);
                }

            }
            int maxDay=stockPrices.indexOf(max);
            System.out.println("The best day to buy stock is on Day " + (minDay + 1) + " for price of : " + minStockPrice);
            System.out.println("The best day to sell stock is on Day " + (maxDay + 1) + " for price of : " + max);
            System.out.println("==================================================");
            //stockPrices(minday,maxday);
            minDay=maxDay+1;
            List<Integer> tempList=new ArrayList<>();
            for(int i=minDay;i<maxDay;i++){
                tempList.add(stockPrices.get(i));
            }
            stockPrices.addAll(tempList);
        }

//        int maxDay=stockPrices.indexOf(max);
//        minDay=maxDay+1;
//        System.out.println("The best day to buy stock is on Day " + (minDay + 1) + " for price of : " + minStockPrice);
//        System.out.println("The best day to sell stock is on Day " + (maxDay + 1) + " for price of : " + max);

    }
}
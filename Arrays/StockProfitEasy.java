package Arrays;
import java.util.*;

//optimal
public class StockProfitEasy {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);

    }
    static int maxProfit(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int j : arr) {
            minPrice = Math.min(minPrice, j);
            maxPro = Math.max(maxPro, j - minPrice);
        }
        return maxPro;
    }
}



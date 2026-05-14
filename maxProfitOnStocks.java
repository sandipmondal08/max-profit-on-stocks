import java.util.*;
public class maxProfitOnStocks {

    public static int buyAndSellStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<price.length;i++){
            if(buyPrice<price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price[] = {7,2,5,1,6,9,8,1,4,5,2};
        int maxProfit = buyAndSellStocks(price);
        System.out.println("Maximum profit is :"+maxProfit);

    }
}

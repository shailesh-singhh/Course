import java.util.*;
public class BuyAndSell {
    public static int  Stock(int price[]){
  int buyPrice = Integer.MAX_VALUE;
  int maxProfit = 0;
  for(int i = 0 ; i<price.length; i++){
    if(buyPrice<price[i]){  //PROFIT CASE 
        int profit = price[i]-buyPrice;
        maxProfit =Math.max(maxProfit,profit);   
    }
    else{
        buyPrice=price[i];
    }
  }
  return maxProfit;
 }
    public static void main(Strings args[]){
        int price[]={7,1,5,3,6,4};
       System.out.println(Stock(price)) ;
}
}

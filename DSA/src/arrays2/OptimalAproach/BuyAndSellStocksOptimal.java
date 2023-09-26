package arrays2.OptimalAproach;

public class BuyAndSellStocksOptimal
{
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int size = arr.length;
        int day = GetProfitDayOp(arr);
        System.out.println("Max profit on day" + " " + day);
    }

    private static int GetProfitDayOp(int[] arr) {

        int profit = 0;
        int minimum_price = Integer.MAX_VALUE;
        for(int i =0 ;i<arr.length;i++)
        {
            minimum_price = Math.min(minimum_price,arr[i]);
            profit = Math.max(arr[i]-minimum_price,profit);
        }
        return profit;
    }
}

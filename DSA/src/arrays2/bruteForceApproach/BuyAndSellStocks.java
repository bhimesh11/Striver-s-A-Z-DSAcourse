package arrays2.bruteForceApproach;

public class BuyAndSellStocks {

    public static void main(String[] args) {

        int arr[] = {7,1,5,3,6,4};
        int size = arr.length;
        int day = GetProfitDay(arr);
        System.out.println("Max profit on day" + " " + day);
    }

    private static int GetProfitDay(int[] arr) {

        int max = 0;
        int values = 0;
        for(int i =0 ;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                   max = arr[j] - arr[i];
                    values = Math.max(max,values);
                }
            }
        }
        return values;
    }
}

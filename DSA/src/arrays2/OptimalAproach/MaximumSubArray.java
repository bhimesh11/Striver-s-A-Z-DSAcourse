package arrays2.OptimalAproach;

public class MaximumSubArray
{
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("Maximum sum" + maxSum);
    MaxSubArray(arr ,n);



        System.out.println(maxSum);
    }

    private static void MaxSubArray(int[] arr, int n) {

        int sum  =0 ;
        long maxi = Long.MIN_VALUE;
        int start = 0, tempstart =0;
        int end = -1;

        for(int i =0;i<n;i++)
        {
            sum = sum+arr[i];



            if(maxi<sum)
            {
                maxi = sum;
                start = tempstart;
                end = i;
            }
            if(sum<0)
            {
                sum =0;
                tempstart = i +1;
            }
            if(maxi<0)
            {
                maxi =0;
            }
        }

        for(int i = start ;i<=end;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    private static long maxSubarraySum(int[] arr, int n) {

        int sum =0 ;

        long maxi = Long.MIN_VALUE;

        for(int i = 0; i<n;i++)
        {
         sum = sum+ arr[i];

         if(maxi<sum)
         {
             maxi = sum;
         }

         if(sum<0)
         {
             sum =0;
         }
         if(maxi<0)
         {
             maxi = 0;
         }

        }
        return maxi;
    }
}

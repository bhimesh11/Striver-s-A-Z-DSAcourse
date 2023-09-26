package arrays1.OptimizedApproach;

public class LeftRotateArraybyOne
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int  n = arr.length;

        LeftShifting(arr , n);

    }

    private static void LeftShifting(int[] arr, int n) {

       int temp = arr[0];
       for(int i = 0;i<n-1;i++)
       {
           arr[i] = arr[i+1];
       }
       arr[n-1] = temp;

       for(int i =0;i<n;i++)
       {
           System.out.print(arr[i] + " ");
       }
    }
}

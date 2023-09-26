package arrays1.OptimizedApproach;

import java.util.Scanner;

public class rotateArrayByKelementsRight
{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String direction = sc.next();
         if(direction.equalsIgnoreCase("right")) {
             k = k % size;

             rotation(arr, 0, size - 1);
             rotation(arr, 0, k - 1);
             rotation(arr, k, size - 1);

             for (int i = 0; i < size; i++) {
                 System.out.print(arr[i] + " ");
             }
         }
         else {
             k = k % size;
             rotation(arr,0,k-1);
             rotation(arr,0,size-1);
             rotation(arr,0,size-1);

             for (int i = 0; i < size; i++) {
                 System.out.print(arr[i] + " ");
             }
         }
    }

    private static void rotation(int[] arr, int start, int end)
    {
        while(start < end ) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

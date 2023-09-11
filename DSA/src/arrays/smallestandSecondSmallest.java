package arrays;

public class smallestandSecondSmallest {

    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 7, 7, 5};
        int size = arr.length;

        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i =1;i<size;i++)
        {
            if(arr[i]<smallest)
            {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]!= smallest && arr[i]<ssmallest)
            {
                 ssmallest = arr[i];
            }
        }
    }
}
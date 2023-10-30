package sortings;

public class bubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        bubbleRecurssion(arr,n);
        for(int i =0;i<=n-1;i++)
        {
            System.out.println(arr[i]);
        }

    }

    private static void bubbleRecurssion(int[] arr, int n) {
        if(n==1)
        {
            return;
        }
        int didSwap = 0;

        for(int j =0;j<=n-2;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didSwap =1 ;
            }

        }
        if(didSwap ==0)
        {
            return;
        }
        bubbleRecurssion(arr,n-1);
    }
}

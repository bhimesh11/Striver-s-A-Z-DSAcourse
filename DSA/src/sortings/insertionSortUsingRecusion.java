package sortings;

public class insertionSortUsingRecusion
{
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        insertionRecurssion(arr,0,n);
        for(int i=0;i<=n-1;i++)
        {
            System.out.println(arr[i]);
        }

    }

    private static void insertionRecurssion(int[] arr, int i, int n) {

        if(i==n)
            return;
        int j = i;
        while(j>0 && arr[j-1]>arr[j])
        {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionRecurssion(arr,i+1,n);
    }
}

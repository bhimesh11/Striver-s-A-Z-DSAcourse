package recurssion;

public class reversedArray2
{
    public static void main(String[] args) {
        int n = 5 ;
        int [] arr = {1,2,3,4,5};
        reversetheNumbers(arr,0,n-1);
        printedArray(arr,n);

    }

    private static void printedArray(int[] arr, int n) {

        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    private static void reversetheNumbers(int[] arr, int start, int end) {


        if(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reversetheNumbers(arr,start+1,end-1);
        }



    }
}

package recurssion;

public class reverseArray
{
    public static void main(String[] args) {
        int n = 5 ;
        int [] arr = {1,2,3,4,5};
        reverseNumbers(arr,n);

    }

    private static void reverseNumbers(int[] arr,int n) {
        int[] ans = new int[n];

        for(int i = n-1; i>=0;i--)
        {
            ans[n-i-1] = arr[i];
        }
        printArrayThis(ans,n);
    }

    private static void printArrayThis(int[] ans, int n) {

        for(int i =0;i<n;i++)
        {
            System.out.println(ans[i] + " ");
        }
    }
}

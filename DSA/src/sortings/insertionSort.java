package sortings;

public class insertionSort
{
    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        int j =0;
        for(int i =0 ;i<=n-1;i++)
        {
            j = i;
            System.out.println("J " + j );
          //  System.out.println("arr [j-1 ] " + arr[j-1]) ;
            System.out.println("arr[j]  " + arr[j]) ;
            while(j>0 && arr[j-1]>arr[j])
            {

                int temp = arr[j-1];
                System.out.println("temp " + temp) ;
                System.out.println("arr [j-1 ] " + arr[j-1]) ;
                arr[j-1] = arr[j];
                System.out.println("arr [j-1 ] " + arr[j-1]) ;
                System.out.println("arr[j]  " + arr[j]) ;
                arr[j] = temp;
                System.out.println("arr[j]  " + arr[j]) ;
                for(int k =0;k<n;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("printing completed");
                j--;
                System.out.println("j--  " + arr[j]) ;
            }
            System.out.println("Iteration completed");
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}

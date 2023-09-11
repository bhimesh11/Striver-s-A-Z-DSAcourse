package sortings;

public class  bubbleSort
{
    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};
        int size = arr.length;
        int didswap = 0;

        for(int i = size-1 ;i>=1;i--)
        {
            System.out.println("I " + arr.length);
            for(int j = 0;j<=i-1;j++)
            {
                System.out.println(arr[j]);
                System.out.println(arr[i-1]);
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    System.out.println("temp "  + temp);
                    arr[j+1] = arr[j];
                    System.out.println("arr[j+1] "  + arr[j+1]);
                    arr[j] = temp;
                    System.out.println("arr[j] "  + arr[j]);
                    didswap ++;

                }
            }
            if(didswap==0)
            {

                break;

            }
            System.out.println("runs " + didswap);
        }
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}


//Avg and worst time complexity is O(n2)
//Best time complexty if no of sorting are less it is O(N)

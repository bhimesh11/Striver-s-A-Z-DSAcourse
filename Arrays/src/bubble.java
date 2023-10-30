public class bubble
{
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int size = arr.length;
        int didSwap = 0;


        for (int i = size-1;i>=1;i--)
        {
            for(int j =0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap++;
                }
            }
            if(didSwap==0)
            {
                break;
            }

        }
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

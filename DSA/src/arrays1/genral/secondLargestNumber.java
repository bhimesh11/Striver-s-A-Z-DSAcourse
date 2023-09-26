package arrays1.genral;

public class secondLargestNumber
{
    public static void main(String[] args) {

        int[] arr = {1,2,4,7,7,5};
        int size = arr.length;

        sortArray(arr, size);
        int largest = arr[size-1];
        int secondLargest = 0;

        for(int i = size-2;i>=0;i--)
        {
            if(arr[i]!= largest)
            {
                secondLargest = arr[i];
                break;
            }
        }
        if(secondLargest!=0) {
            System.out.println(secondLargest);
        }
        else {
            System.out.println(-1);
        }


    }

    private static void sortArray(int[] arr, int size) {

        for(int i = size-1;i>=1;i--)
        {

            for(int j =0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

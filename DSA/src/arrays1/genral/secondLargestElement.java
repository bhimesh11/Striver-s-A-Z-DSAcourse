package arrays1.genral;

public class secondLargestElement
{
    public static void main(String[] args) {

        int [] arr = {1,2,4,7,7,5};
        int size  = arr.length;
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 1;i<size;i++)
        {
            if(arr[i]> largest)
            {
             slargest = largest;
             largest = arr[i];
            }
            else if (arr[i]<    largest && arr[i]>slargest )
            {
                slargest = arr[i];
            }
        }
        System.out.println("first largest " + largest);
        System.out.println("Second Largest" + slargest);


    }
}

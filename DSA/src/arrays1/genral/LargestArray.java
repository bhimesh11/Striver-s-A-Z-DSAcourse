package arrays1.genral;

public class LargestArray
{
    public static void main(String[] args) {

        int [] arr = {3,2,1,5,2};
        int size = arr.length;
        int largest = 0;

        largest = arr[0];

        for(int i =0; i<size;i++)
        {
            if(arr[i]>largest)
                 {
                     largest = arr[i];
                 }
             }

        System.out.println("largest element in the array is " + largest );

        }
    }


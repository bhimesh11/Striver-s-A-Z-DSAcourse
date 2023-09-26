package arrays1.genral;

public class checkArrayIsSortedOrNot
{
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,1};
        int size = arr.length;

        for(int i =0;i<size;i++)
        {
            for(int j = i+1;j<size;j++)
            {
                if(arr[j]< arr[i])
                {
                    System.out.println("Array is not sorted");
                }

            }

        }

            System.out.println("Array is sorted");

    }
}

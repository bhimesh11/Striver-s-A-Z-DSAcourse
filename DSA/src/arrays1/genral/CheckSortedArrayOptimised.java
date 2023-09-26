package arrays1.genral;

public class CheckSortedArrayOptimised
{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,0};
        int size = arr.length;


        System.out.println(checkSorted(arr,size));
    }

    private static boolean checkSorted(int[] arr, int size) {

        for(int i =1 ;i<=size;i++)
        {
            if(arr[i]>arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}

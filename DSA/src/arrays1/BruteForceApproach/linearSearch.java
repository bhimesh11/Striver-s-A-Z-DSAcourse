package arrays1.BruteForceApproach;

public class linearSearch {

    public static void main(String[] args) {

        int [] arr  = {1,2,3,4,5};
        int size  = arr.length;
        int num = 1;

        System.out.println(findTheElement(arr,num));

    }

    private static int findTheElement(int[] arr, int num) {

        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        return -1;
    }
}

package arrays;

public class RemoveDuplicatesOptimized {
    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int size = arr.length;
       int k =  removeDuplicatesOp(arr , size);
    for(int i =0;i<k;i++)
    {
        System.out.println(arr[i] + " ");
    }


    }

    private static int removeDuplicatesOp(int[] arr, int size) {

        int i =0;
        //{1, 1, 2, 2, 2, 3, 3};
        for(int j =1;j<size;j++)
        {
            if(arr[i]!= arr[j])
            {
                i++;
              //  System.out.println(i);
                System.out.println(arr[i]);
                System.out.println(arr[j]);
                arr[i+1] = arr[j];

            }
        }
        return i+1;
    }
}
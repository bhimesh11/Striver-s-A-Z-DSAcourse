package arrays1.genral;

public class RemoveDuplicatesOptimized {
    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int size = arr.length;
       int k =  removeDuplicatesOp(arr , size);
        System.out.println(k);
    for(int i =0;i<k;i++)
    {
        System.out.print(arr[i] + " ");
    }


    }

    private static int removeDuplicatesOp(int[] arr, int size) {

        int i = 0 ;
        for(int j = 1;j<size;j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
return i+1;
    }
}
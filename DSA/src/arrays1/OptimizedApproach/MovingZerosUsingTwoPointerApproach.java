package arrays1.OptimizedApproach;

public class MovingZerosUsingTwoPointerApproach {
    public static void main(String[] args) {


    int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
    int n = arr.length;
    int[] ans = moveZerosOp(n, arr);
        for(
    int i = 0;
    i<n;i++)

    {
        System.out.print(ans[i] + " ");
    }
        System.out.print("");
}

    private static int[] moveZerosOp(int n, int[] arr) {

        int zeroPointer = 0;

        for(int i =0 ;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[zeroPointer++] = arr[i];
            }
        }
        System.out.println("zero pointer " + zeroPointer);
        while(zeroPointer < n)
        {
            arr[zeroPointer++] = 0;
        }
        return arr;
    }


}

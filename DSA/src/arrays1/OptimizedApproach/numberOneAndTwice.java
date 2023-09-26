package arrays1.OptimizedApproach;

public class numberOneAndTwice
{
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println(ans);
    }

    private static int getSingleElement(int[] arr) {
        int n = arr.length;

        int xor = 0;
        for(int i =0;i<n;i++)
        {
            xor = xor ^ arr[i];
            System.out.println(xor);

        }
        return xor;
    }
}

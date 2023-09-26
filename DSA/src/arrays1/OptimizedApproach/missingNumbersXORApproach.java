package arrays1.OptimizedApproach;

public class missingNumbersXORApproach
{
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        int size = arr.length +1 ;

        System.out.println(xorCalculation(arr,size));
    }

    private static int xorCalculation(int[] arr, int size) {
        int xor1=0;
        int xor2=0;

        for(int i =0 ;i<size-1;i++)
        {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1^size;

        return xor1^xor2;


    }
}

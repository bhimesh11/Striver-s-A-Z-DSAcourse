package arrays1.BruteForceApproach;

public class numberOnceAndTwice
{
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,1,3};
        int size = arr.length;
        System.out.println(findNumberCameOnce(arr,size));
    }

    private static int findNumberCameOnce(int[] arr, int size) {

        for(int i =0;i<size;i++)
        {
            int num = arr[i];
            int count = 0;
            for(int j =0 ;j<size;j++)
            {
                if(arr[j]==num)
                {
                 count++;
                }
            }
            if(count==1)
            {
                return num;
            }
        }
        return -1;

    }
}

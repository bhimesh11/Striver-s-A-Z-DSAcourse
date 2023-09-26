package arrays1.BetterApproach;

public class longestSubArrayLength
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        int size = arr.length;
        int finalArray = findLogsubarrayLenBetter(arr, k);
        System.out.println(finalArray);
    }

    private static int findLogsubarrayLenBetter(int[] arr, int k) {

        int len =0;
        for(int i =0;i<arr.length;i++)
        {
            int sum = 0;
            for(int j =i;j<arr.length;j++)
            {
                sum = sum + arr[j];

                if(sum == k)
                {
                    len = Math.max(len,j-i+1);
                }

            }
        }
        return len;
    }
}

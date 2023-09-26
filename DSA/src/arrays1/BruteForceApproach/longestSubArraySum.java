package arrays1.BruteForceApproach;

public class longestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        int size = arr.length;
        int finalArray = findLogsubarrayLen(arr, k);
        System.out.println(finalArray);

    }

    private static int findLogsubarrayLen(int[] arr, int k) {

        int len = 0 ;

        for(int i =0 ;i<arr.length;i++)
        {
            for(int j =i ;j<arr.length;j++)
            {
                int sum =0 ;
                for(int n =i ;n<=j;n++)
                {
                    sum = sum + arr[n];

                }
                if(sum==k)
                {
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;

    }
}


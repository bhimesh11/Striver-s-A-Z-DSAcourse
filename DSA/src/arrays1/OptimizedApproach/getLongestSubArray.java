package arrays1.OptimizedApproach;

public class getLongestSubArray
{
    public static void main(String[] args) {

        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = ogetLongestSubarray(a, k);
        System.out.println(len);

    }

    private static int ogetLongestSubarray(int[] a, long k) {

        int n = a.length;

        int left =0 ;
        int right =0;
        int maxlen =0;
        int sum = a[0];

        while(right<n)
        {
            while(left<= right && sum > k)
            {
                sum = sum-a[left];
                left++;
            }
            if(sum ==k )
            {
                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n)
            {
                sum = sum+ a[right];
            }
        }
        return maxlen;
    }
}

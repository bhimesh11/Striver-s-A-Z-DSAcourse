package arrays1.BetterApproach;

import java.util.HashMap;
import java.util.Map;

public class getLongestSubArray
{
    public static void main(String[] args) {

        int[] a = {2,0,0,3};
        long k = 3;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);

    }

    private static int getLongestSubarray(int[] a, long k) {

        int sum =0 ;
        int maxLen =0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<a.length;i++)
        {
         sum = sum + a[i];
         if(sum == k)
         {
             maxLen = Math.max(maxLen, i+1);
         }
         long rem = sum -k;

         if(map.containsKey(rem))
         {
             int len = i-map.get(rem);
             maxLen = Math.max(maxLen,len);
         }
         if(!map.containsKey(rem))
         {
             map.put(sum , i);
         }
        }
        return maxLen;
    }
}

package arrays2.OptimalAproach;

import java.util.HashMap;

public class countSubarraySumEqalK
{
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }

    private static int findAllSubarraysWithGivenSum(int[] arr, int k) {

        int count = 0;
        int preSum = 0 ;

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1); // setting 0 in the Map

        for(int i =0;i<arr.length;i++)
        {
           //add current element in to prefix sum
            preSum = preSum+arr[i];

            //calculate x-k
            int remove = preSum-k;

            //Add the numbers of sub arrays to be removed
            count = count + hashMap.getOrDefault(remove,0);

            //update the count of prefix sum
            //in the map
            hashMap.put(preSum,hashMap.getOrDefault(preSum,0)+1);

        }
        return count;
    }
}

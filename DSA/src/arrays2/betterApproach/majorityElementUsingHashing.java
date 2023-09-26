package arrays2.betterApproach;

import java.util.HashMap;
import java.util.Map;

public class majorityElementUsingHashing
{
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = getMajorityElementusingHash(arr);
        System.out.println(ans);
    }

    private static int getMajorityElementusingHash(int[] arr) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i =0; i<arr.length;i++)
        {

                hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);

        }
       for(Map.Entry<Integer,Integer>hashEntry: hash.entrySet())
       {
          if(hashEntry.getValue()> arr.length/2)
          {
              return hashEntry.getKey();
          }
       }
       return -1;
    }
}

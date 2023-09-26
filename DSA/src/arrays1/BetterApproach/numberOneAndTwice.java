package arrays1.BetterApproach;

import java.util.HashMap;
import java.util.Map;

public class numberOneAndTwice {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 1, 3,3,5};
        int size = arr.length;
        System.out.println(findNumberCameOnceBetter(arr, size));
    }

    private static int findNumberCameOnceBetter(int[] arr, int size) {

        Map<Integer,Integer> hash= new HashMap<>();
        for(int i =0;i<size;i++)
        {
            int value = hash.getOrDefault(arr[i],0);
            hash.put(arr[i],value+1);
        }

        for(Map.Entry<Integer,Integer> entry: hash.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
return -1;
    }
}

package Hasing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements
{
    public static void main(String[] args) {
        //int[] arr = {10,5,10,15,10,5};
        int[] arr =   {2,2,3,4,4,2};
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey() + " appears" +" : " + entry.getValue());
        }
    }
}

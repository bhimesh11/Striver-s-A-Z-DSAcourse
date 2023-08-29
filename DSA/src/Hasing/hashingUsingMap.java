package Hasing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashingUsingMap
{
    public static void main(String[] args) {

        int[] arr = {1,2,2,1,5,12,3,2};
        int n = arr.length;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "appears"+ ":" + entry.getValue());
        }

       /* int q ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        q=sc.nextInt();
        while(q!=0)
        {
            int w;
            Scanner sc2 =new Scanner(System.in);
            System.out.println("Enter number");
            w=sc.nextInt();
            System.out.println(map.get(w));
            q--;
        }*/
    }
}

package arrays1.BruteForceApproach;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionUsingSet
{
    public static void main(String[] args) {

     int   arr1[] = {1,2,3,4,5,6,7,8,9,10};
       int arr2[] = {2,3,4,4,5,11,12};
    ArrayList<Integer> union = UsingSet(arr1,arr2,arr1.length,arr2.length);
        System.out.println(union);

    }

    private static ArrayList<Integer> UsingSet(int[] arr1, int[] arr2, int length, int length1) {

        HashSet<Integer> hash = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for(int i =0;i<arr1.length;i++)
        {
            hash.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++)
        {
            hash.add(arr2[i]);
        }

        for(int i : hash)
        {
            union.add(i);
        }
        return union;
    }
}

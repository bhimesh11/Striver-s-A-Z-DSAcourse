package arrays1.BruteForceApproach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UnionUsigMap
{
    public static void main(String[] args) {


        //int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

     ArrayList<Integer> newArray =  unionArrays(arr1, arr2, arr1Size, arr2Size);

        System.out.println(newArray);
    }

    private static ArrayList<Integer> unionArrays(int[] arr1, int[] arr2, int arr1Size, int arr2Size) {

        Map<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < arr1Size; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);

        }
        for (int i = 0; i < arr2Size; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }


        for (int i : freq.keySet()) {
            union.add(i);
        }
return union;
    }
}

package arrays3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int ans = majorityElementBruteApproach(arr, n);
        System.out.println("The majority element using brute Approach: " + ans);
        int MapAnswer = majorityElementUsingMap(arr, n);
        System.out.println("The majority element using map approach " + MapAnswer);

    }

    private static int majorityElementUsingMap(int[] arr, int n) {

        HashMap<Integer,Integer> mapi = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        for(int i =0;i<n;i++)
        {
            int value = mapi.getOrDefault(arr[i],0);
            mapi.put(arr[i],value+1);
           if(mapi.get(arr[i])==((n/3)))
            {
             return arr[i];
            }
9121165812
        }

        return -1;
    }

    private static int majorityElementBruteApproach(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > (n / 3)) {
                return arr[i];
            }
        }
        return -1;
    }
}
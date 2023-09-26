package arrays1.BruteForceApproach;

import java.util.ArrayList;

public class LeadingZeros
{
    public static void main(String[] args) {

        int [] arr =  {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int [] ans = moveZeros(n,arr);
        for(int i =0 ;i<n;i++)
        {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    private static int[] moveZeros(int n, int[] arr)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i =0 ;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp.add(arr[i]);
            }
        }
        for(int i = 0;i<temp.size();i++)
        {
            arr[i] = temp.get(i);
        }
        for(int i = temp.size();i<n;i++)
        {
            arr[i] =0;
        }
        return arr;
    }
}

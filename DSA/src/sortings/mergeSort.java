package sortings;

import java.util.ArrayList;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        mergerSorting(arr, 0 , n-1);
        for(int i =0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    private static void mergerSorting(int[] arr, int low, int high) {

        if(low >= high)
            return;
        int mid = (low + high)/2;
        mergerSorting(arr,low,mid);
        mergerSorting(arr,mid+1,high);
        mergerArrays(arr,low,mid,high);

    }

    private static void mergerArrays(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<= high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }

     for(int i = low ;i<=high;i++)
     {
         arr[i] = temp.get(i-low);
     }
    }

}

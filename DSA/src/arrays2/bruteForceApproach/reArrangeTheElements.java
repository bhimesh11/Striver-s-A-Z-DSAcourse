package arrays2.bruteForceApproach;

import java.util.ArrayList;

public class reArrangeTheElements
{
    public static void main(String[] args) {

        int[] arr = {1,2,-4,-5};
        int size = arr.length;
     int [] finalarr =  reArrangeTheElementsB(arr,size);

     for(int i =0 ;i<finalarr.length;i++)
     {
         System.out.println(finalarr[i]);
     }

    }

    private static int[] reArrangeTheElementsB(int[] arr, int size) {

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i =0 ;i<size;i++)
        {
            if(arr[i]<0)
            {
                neg.add(arr[i]);
            }
            else {
                positive.add(arr[i]);
            }
        }

        int [] newint = new int[neg.size()+positive.size()];

        for(int i =0 ;i<size/2;i++)
        {
            newint[2*i] = positive.get(i);
            newint[2*i+1] = neg.get(i);
        }

        return newint;
    }
}

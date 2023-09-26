package arrays2.OptimalAproach;

import java.util.ArrayList;

public class leaderOfArrayOptimal
{
    public static void main(String[] args) {
        int arr[]=  {10, 22, 12, 3, 0, 6};
        int size = arr.length;
        ArrayList<Integer> finalvalues = getTheLeaderOfArrayinOptimal(arr);
        System.out.println(finalvalues );
    }

    private static ArrayList<Integer> getTheLeaderOfArrayinOptimal(int[] arr) {

        ArrayList<Integer> al = new ArrayList<>();
       int maxi = Integer.MIN_VALUE;
       for(int i = arr.length-1;i>=0;i--)
       {
           if(arr[i]>maxi)
           {
               al.add(arr[i]);

           }

           maxi = Math.max(maxi,arr[i]);
       }
       return al;
    }
}

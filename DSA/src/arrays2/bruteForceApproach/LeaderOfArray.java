package arrays2.bruteForceApproach;

import java.util.ArrayList;

public class LeaderOfArray
{
    public static void main(String[] args) {

        int arr[]=  {10, 22, 12, 3, 0, 6};
        int size = arr.length;
        ArrayList<Integer> finalvalues = getTheLeaderOfArray(arr);
        System.out.println(finalvalues);
    }

    private static ArrayList<Integer> getTheLeaderOfArray(int[] arr) {

        ArrayList<Integer> al = new ArrayList<>();

        for(int i =0;i<arr.length;i++)
        {
            boolean leader = true;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]> arr[i])
                {
                    leader = false;
                    break;
                }
            }
            if(leader == true)
            {
                al.add(arr[i]);
            }
        }
        return al;
    }
}

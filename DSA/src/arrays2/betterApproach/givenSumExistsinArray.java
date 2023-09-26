package arrays2.betterApproach;

import java.util.HashMap;

public class givenSumExistsinArray
{
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 15;
        int size = arr.length;
     String isExists =    CheckGivenSumExists(arr,size,target);
        //System.out.println(isExists);
        System.out.println("This is the answer for variant 1 :" + isExists);
        int [] finalvalues = getTheIndices(arr,size,target);
        if(isExists.equalsIgnoreCase("Yes")) {
            for (int i = 0; i < finalvalues.length; i++) {
                System.out.println("This is the answer for variant 2: [" + finalvalues[0] + ", "
                        + finalvalues[1] + "]");
            }
        }

            System.out.println("This is the answer for variant 2: [" + finalvalues[0] + ", "
                    + finalvalues[1] + "]");

    }

    private static int[] getTheIndices(int[] arr, int size, int target) {

        int[] na = new int[2];
        na[0]=na[1]=-1;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i =0;i<size;i++)
        {
            int num = arr[i];
            int checkValue = target-num;
            if(hash.containsKey(checkValue))
            {
                na[0] = hash.get(checkValue);
                na[1] = i;
                return na;
            }
            hash.put(arr[i],i);
        }
        return na;

    }

    private static String CheckGivenSumExists(int[] arr, int size, int target) {

        HashMap<Integer,Integer> hash = new HashMap<>();
        int valueCheck ;

        for(int i =0;i<size;i++)
        {
            int num = arr[i];
                 valueCheck = target-num;
                if(hash.containsKey(valueCheck))
                {
                    System.out.println(valueCheck);
                    return
                            "Yes";
                }
                hash.put(arr[i],i);
            }
        return "No";
    }
}

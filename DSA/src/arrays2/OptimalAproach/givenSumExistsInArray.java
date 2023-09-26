package arrays2.OptimalAproach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class givenSumExistsInArray
{
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int size = arr.length;
      boolean isExists =  checkTheSeum(arr,size,target);

      int[] finalArr =  checkTheIndices(arr,size,target);
      if(isExists)
      {
          for(int i =0;i<finalArr.length;i++)
          {
              System.out.println("This is the answer for variant  [" + finalArr[0] + ", "
                      + finalArr[1] + "]");
          }
      }

        System.out.println("This is the answer for variant  [" + finalArr[0] + ", "
                + finalArr[1] + "]");


    }

    private static int[] checkTheIndices(int[] arr, int size, int target) {

        int[] na = new int[2];
        na[0] = na[1] = -1;
        int left =0;
        int right =size-1;
        int sum;
        Arrays.sort(arr);
        while(left<right)
        {
            sum = arr[left] + arr[right];

            if(sum < target)
            {
                left++;
            }
           else if(sum > target)
            {
                right--;
            }
           else if(sum==target)
            {
                na[0] = arr[left];
                na[1] = arr[right];
                return na;
            }

        }
        return na;
    }

    private static boolean checkTheSeum(int[] arr, int size, int target) {

        int left = 0;
        int right =0;
        int sum;
        Arrays.sort(arr);
        while(left<right)
        {
            sum = arr[left] + arr[right];
            if(sum<target)
            {
                left++;
            }
            else if (sum>target)
            {
                right--;
            }
            else if (sum == target)
            {
                return true;
            }
        }
        return false;
    }
}

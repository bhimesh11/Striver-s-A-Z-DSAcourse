package arrays2.bruteForceApproach;

public class givenSumExistsInArray
{
    public static void main(String[] args) {
     int[]  arr = {2, 6, 5, 8, 11};
     int size = arr.length;
     int target = 14;
   int[] finalvalues =  ExtractGivenSum(arr,size,target);
   boolean finalExpression = false;
   for(int i =0;i<finalvalues.length;i++)
   {
       if(finalvalues[i] == -1) {

           System.out.println(finalvalues[i]);
       }
           finalExpression = true;
           System.out.println(finalvalues[i]);
       }
        System.out.println(finalExpression);
   }


    private static int[] ExtractGivenSum(int[] arr, int size,int target) {

        int[] na = new int[2];
        na[0] = na[1]= -1;

        for(int i = 0 ;i<size;i++)
        {
            for(int j = i+1;j<size;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    na[0] = i;
                    na[1] = j;
                    return na;
                }
            }
        }
        return na;

    }
}

package arrays2.OptimalAproach;

public class majorityELementUsingMooreVotingAlgo
{
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = getMajorityElementusingvotingAlgo(arr);
        System.out.println(ans);
    }

    private static int getMajorityElementusingvotingAlgo(int[] arr) {

        int count =0;
        int element = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(count ==0)
            {
                element = arr[i];
                count =1;
            }
            else if (arr[i] == element)
            {
                count++;
            }
            else {
                element--;
            }
        }
        int counter =0 ;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == element)
            {
                counter++;
            }
            if(counter>arr.length/2);
            {
                return arr[i];
            }
        }
        return -1;
    }
}

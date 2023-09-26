package arrays1.BruteForceApproach;

public class missingNumbers
{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3,4,5,6,8,9};
        int size = arr.length;
        System.out.println(findMissingNumbers(arr, size));
    }



    private static int findMissingNumbers(int[] arr, int size) {

            for(int i =1;i<size;i++)
            {
                int flag  = 0;
                for(int j =0 ;j<size-1;j++)
                {
                    if(arr[j]==i)
                    {
                        flag = -1;
                        break;
                    }

                }
                if(flag ==0 )
                {
                    return i;
                }
            }

            return -1;

        }
    }


package arrays2.OptimalAproach;

public class reArrangeTheElements
{
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        int size = arr.length;
        int [] finalarr =  reArrangeTheElementsO(arr,size);

        for(int i =0 ;i<finalarr.length;i++)
        {
            System.out.println(finalarr[i] + " ");
        }
    }

    private static int[] reArrangeTheElementsO(int[] arr, int size) {

        int positiveNum = 0 ;
                int negativeNum =1;
                int[] newint = new int[arr.length];
                for(int i =0;i<arr.length;i++)
                {
                    if(arr[i]<0)
                    {
                        newint[i] = arr[negativeNum];
                        negativeNum += 2;
                    }
                    else {
                        newint[i] = arr[positiveNum];
                        positiveNum += 2;
                    }
                }
                return newint;
    }
}

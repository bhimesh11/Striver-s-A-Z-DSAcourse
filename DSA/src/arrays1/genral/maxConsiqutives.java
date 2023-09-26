package arrays1.genral;

public class maxConsiqutives
{
    public static void main(String[] args) {

        int [] arr = {1, 1, 0, 1, 1, 1,1};
        int size = arr.length;
        System.out.println(getmaximumConsiqutives(arr,size));


    }

    private static int getmaximumConsiqutives(int[] arr, int size) {

        int max = 0 ; int count =0;

        for(int i =0;i<size;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else {
                count =0;
            }

            max = Math.max(max,count);
        }
        return max;
    }
}

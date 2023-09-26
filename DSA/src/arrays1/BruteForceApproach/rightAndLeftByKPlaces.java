package arrays1.BruteForceApproach;

public class rightAndLeftByKPlaces
{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int size = arr.length;
        int k = 2;
        String direction = "right";

        if(direction.equalsIgnoreCase("right"))
        {
            rotateRightbyKplaces(arr,size,k);
            for(int i =0;i<size;i++)
            {
                System.out.print(arr[i] +  " ");
            }
        }


    }

    private static void rotateRightbyKplaces(int[] arr, int k, int n)
    {

        if(n==0)
            return;
       // k = k%n;
        System.out.println("K is " +k);
        if(k>n)
            return;
        int[] temp = new int[k];

        for(int i= n-k ;i<n;i++) //5 ,
        {
            temp[i-n+k] = arr[i];
        }
        for(int i = n-k-1;i>=0;i--)
        {
          arr[i+k] = arr[i];
        }
        for(int i =0;i<k;i++)
        {
            arr[i] = temp[i];
        }

    }
}

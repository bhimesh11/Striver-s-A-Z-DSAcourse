import java.util.Arrays;
import java.util.Random;

public class usingArrays
{
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        //using streams
//      int[] sortedArray = Arrays.stream(firstArray).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArray));
        //using Arrays sort class
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        //using Arrays fill method

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5); // fill method is used to fill the array with the specfied number

        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.fill(fourthArray,5);
        System.out.println(Arrays.toString(fourthArray));
int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));
        int[] largeArray = Arrays.copyOf(thirdArray, 13);
        System.out.println(Arrays.toString(largeArray));
    }

   private static int[] getRandomArray(int len)
   {
       Random random = new Random();
       int[] intlen = new int[len];
       for(int i =0;i<len;i++)
       {
           intlen[i] = random.nextInt(100);

       }
       return intlen;
   }
}

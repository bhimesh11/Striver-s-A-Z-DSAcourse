import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class challange {
    public static void main(String[] args) {

        int[] first = randomGenerator(10);
        System.out.println(Arrays.toString(first));
        //Arrays.sort(first,Comparator.reverseOrder());
        int[] sortedArray = doSorting(first);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(sortedArray));
      //  System.out.println("LastELement" + sortedArray.length-1);
        if(Arrays.binarySearch(sortedArray,sortedArray.length-1)>=0)
        {
            System.out.println("Number found");
        }
        System.out.println("Number not found");
    }

    private static int[] doSorting(int[] first) {
        System.out.println("Method started Here");

        System.out.println(Arrays.toString(first));
        int[] sortedArray = Arrays.copyOf(first, first.length);
    int[] checkDuplicatesinArray = doDuplicationcheck(sortedArray);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < checkDuplicatesinArray.length - 1; i++) {

                if (checkDuplicatesinArray[i] < checkDuplicatesinArray[i + 1]) {
                    System.out.println("loop");
                    temp = checkDuplicatesinArray[i];
                    checkDuplicatesinArray[i] = checkDuplicatesinArray[i + 1];
                    checkDuplicatesinArray[i + 1] = temp;
                    flag = true;
                    System.out.println(Arrays.toString(checkDuplicatesinArray));
                }
            }
        }
return checkDuplicatesinArray;
    }

    private static int[] doDuplicationcheck(int[] sortedArray) {

        int[] nonduplicates = new int[sortedArray.length];
        int j =0;

        for(int i =0;i<sortedArray.length-1;i++)
        {
            if(sortedArray[i] != sortedArray[i+1])
            {
                nonduplicates[j++] = sortedArray[i];

            }
        }
        nonduplicates[j++] = sortedArray[sortedArray.length-1];
        for(int i =0 ;i<j;i++)
        {
            sortedArray[i] = nonduplicates[i];

        }
        return sortedArray;
    }

    public static int[] randomGenerator(int len)
    {
        Random random = new Random();
        int[] newInt = new int[len];
      for(int i = 0;i<len;i++)
      {
          newInt[i] = random.nextInt(100);
      }
      return newInt;
    }
}

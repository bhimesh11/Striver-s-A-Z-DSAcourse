package arrays;

public class subarraySum {

    //15, 2, 4, 8, 9, 5, 10, 23
    int subArraySum(int[] arr, int n, int s) {
        int currentSum = arr[0]; // 15
        int i;
        int start = 0; //n =7

        for (i = 1; i <= n; i++)

            System.out.println(i);
        System.out.println(currentSum);
        System.out.println(start);
        System.out.println(s);
        System.out.println(i - 1);
       // System.out.println(arr[i - 1]);
        while (currentSum > s && start < i - 1) //2>23 , 4>23 , 8>23 9>23 5>23 ,10>23 23> 23
        {
            System.out.println("currentsum > s");
            System.out.println(arr[start]);
            currentSum = currentSum - arr[start]; //15-
            start++;
            System.out.println(start);
        }
        if (currentSum == s) {
            System.out.println("currentsum ==s");
            int p = i - 1;
            System.out.println(p);
            System.out.println("Sum found between indexes " + start
                    + " and " + p);
            return 1;
        }
        if (i < n)
        {
            System.out.println("i<n");

        currentSum = currentSum + arr[i];
        System.out.println(currentSum);
        System.out.println("----------------");
    }
           System.out.println("No subarray found");
        return 0;
}

    public static void main(String[] args) {

        subarraySum subarray = new subarraySum();
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int s = 23;
       subarray.subArraySum(arr,n,s);

    }
}

package arrays3;

public class PascalsTrainagle
{
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number

        int element = printPascalsTriangle(r,c);
        System.out.println(element);

        int n =5;
        printColumninpascalsTraingle(n);
    }

    private static void printColumninpascalsTraingle(int n) {

        int ans = 1;

        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    private static int printPascalsTriangle(int r, int c) {

      int element = (int) findncr(r-1,c-1);

      return element;
    }


    private static long findncr(int a, int b) {

        long res =1 ;

        for(int i =0;i<b;i++)
        {
            res = res * (a-i);
            res = res/ (i+1);
        }
        return  res;
    }
}

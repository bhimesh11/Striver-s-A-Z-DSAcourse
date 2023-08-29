package recurssion;

public class fibonacciRecursion
{
    public static void main(String[] args) {
        int n =4;
        System.out.println(fibonacciRe(n));
    }

    private static int fibonacciRe(int n) {

        if(n<=1)
        {
            return n;
        }
        int last = fibonacciRe(n-1);
        int first = fibonacciRe(n-2);

        return  last+first;
    }
}

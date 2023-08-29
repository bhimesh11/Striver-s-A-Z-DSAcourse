package recurssion;

public class factorialTraditional
{
    public static void main(String[] args) {

        int number = 25;

        factorial(number);
    }

    private static void factorial(int number) {
        int ans= 1;
        for(int i =1 ;i<=number;i++)
        {
            ans = ans*i;
        }
        System.out.println(ans);
    }
}

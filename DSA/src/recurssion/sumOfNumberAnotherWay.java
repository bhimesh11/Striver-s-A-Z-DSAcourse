package recurssion;

public class sumOfNumberAnotherWay
{
    public static void main(String[] args) {
       int n = 12;
     //  func(n);
        System.out.println(func(n));
    }

    private static int func(int n) {

        if(n==0)
        {
            return 0;
        }
        return n + func(n-1);
    }
}

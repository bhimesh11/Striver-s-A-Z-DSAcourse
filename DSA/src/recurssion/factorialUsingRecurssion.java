package recurssion;

public class factorialUsingRecurssion
{
    public static void main(String[] args) {
        int number = 25;

        //factorialre(number);
        System.out.println(factorialre(number));
    }

    private static int factorialre(int number) {


       // System.out.println(number);
        if(number ==0)
        {
            return 1;
        }
else {
           // System.out.println(number);
            return  number * factorialre(number-1);
        }
    }
}

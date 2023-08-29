package recurssion;

public class sumofNumbers
{
    public static void main(String[] args) {
        int boundaries= 5;
         sumofTheNumbers(1, boundaries);

    }

    private static void sumofTheNumbers(int i, int boundaries) {

        int sum =0;
        if(boundaries>=i)
        {
            sum = sum +i;
            System.out.println(sum);
            sumofTheNumbers(i+1,boundaries);
        }
        else {
            return;
        }
    }
}

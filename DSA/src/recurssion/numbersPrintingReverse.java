package recurssion;

import java.util.Arrays;

public class numbersPrintingReverse
{
    public static void main(String[] args) {
        int boundries = 25;
        printingNumbersReverse(25);
    }

    private static void printingNumbersReverse(int i) {


        int t =1;
        if(i>=t) {
            System.out.println(i);
            printingNumbersReverse(i-1);

        }
        else {
            return;
        }
    }
}

package recurssion;

public class numberPrinting {

    public static void main(String[] args) {

        int limit = 25;
        printNumbers(1,limit);

    }

    private static void printNumbers(int i, int limit) {

        if (i <= limit) {
            System.out.println(i);
            printNumbers(i + 1, limit);
        } else {
            return;
        }
    }
}

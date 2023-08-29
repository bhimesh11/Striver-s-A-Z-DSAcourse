package recurssion;

public class NamePrinting
{
    public static void main(String[] args) {

        String name = "Bhimesh";
        int times = 3;
        printName(name ,1, 3);
    }

    private static void printName(String name, int i, int t) {

        if(i>t) return;
        System.out.println("name is bhimesh");
        printName(name,i+1,t);
    }
}

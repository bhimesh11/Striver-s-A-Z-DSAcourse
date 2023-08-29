import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args)
    {
        int[] array = new int[10];
//        for(int element: array)
//        {
//            System.out.println(element);
//        }

        for(int i = 0 ;i<10;i++)
        {
            array[i] = i;
        }
        Arrays.stream(array).sorted();

        for(int element: array)
        {
            System.out.println("The element is " +element);
        }

        for(int i =0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        for(int element: array)
        {
            System.out.println(element);
        }
        System.out.println("last element is " + array[array.length-1]);
        System.out.println("Hello world!");
        //Arrays.stream(array).
        System.out.println(Arrays.toString(array));
        Object objectVariable = array;
        if (objectVariable instanceof int[])
        {
            System.out.println("object varaible");
        }
        Object[] objects = new Object[3];

        objects[0] = "Hello";
        objects[1] = new StringBuilder("World");
        objects[2] = array; //this is called nested array

        System.out.println(Arrays.toString(objects));
    }
}
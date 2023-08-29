import java.util.Arrays;

public class binarySearch
{
    public static void main(String[] args) {
        String[] sArray = {"Bhimesh","charan","sankar","kashyap","sarath"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"sarath")>=0)
        {
            System.out.println("element found");
        }
        int[] array1 ={1,2,3,4,5};
        int[] array2 = {1,3,4,5,6};
        if(Arrays.equals(array1,array2))
        {
            System.out.println("arrays are same");
        }
        System.out.println("array are not same");
    }
}

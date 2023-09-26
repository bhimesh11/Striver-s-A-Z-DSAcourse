package arrays1.genral;

import java.util.HashSet;

public class removeDuplicates
{
    public static void main(String[] args) {


    int [] arr ={1,1,2,2,2,3,3};
    int size = arr.length;

  //  int[] finalArray = new int[size];

   int l =  RemoveDuplicates(arr, size);
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
}

    private static int RemoveDuplicates(int[] arr, int size) {

        HashSet<Integer> hash = new HashSet<>();

        for(int i =0 ;i<size;i++)
        {
          hash.add(arr[i]);
        }
        int j =0 ;
        int k = hash.size();

        for(int x: hash) {

           arr[j++] = x;
        }
        return k;


    }

}

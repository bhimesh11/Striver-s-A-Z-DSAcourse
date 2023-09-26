package arrays2.bruteForceApproach;

import java.util.ArrayList;
import java.util.List;

public class Sort012
{
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList(List.of(new Integer[]{0, 2, 1, 2, 0, 1}));
        int size = al.size();
       int[] finalvalues =  sortFunction(al,size);

       for(int i =0;i< finalvalues.length;i++)
       {
           System.out.print(finalvalues[i] + " ");
       }


    }

    private static int[] sortFunction(ArrayList<Integer> al, int size) {

        int count_0 = 0 ;
        int count_1 = 0;
        int count_2 = 0;

        for(int i = 0 ;i<al.size();i++)
        {
            if(al.get(i)==0)
            {
                count_0++;
            }
            else if(al.get(i)==1)
            {
                count_1++;
            }
            else if (al.get(i)==2)
            {
                count_2++;
            }
        }

        int [] arr= new int[count_0+count_1+count_2];

        for(int i =0;i<count_0;i++)
        {
            arr[i] = 0;
        }

        for(int i =count_0;i<count_0+count_1;i++)
        {
            arr[i] = 1;
        }
        for(int i =count_0+count_1;i<size;i++)
        {
            arr[i] = 2;
        }

        return arr;


    }
}

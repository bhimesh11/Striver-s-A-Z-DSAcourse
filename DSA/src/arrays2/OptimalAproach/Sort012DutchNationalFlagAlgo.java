package arrays2.OptimalAproach;

import java.util.ArrayList;
import java.util.List;

public class Sort012DutchNationalFlagAlgo
{
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(List.of(new Integer[] {0, 2, 1, 2, 0, 1}));
        int size = al.size();
        sortWithDutchNationalFlagAlgo(al,size);

        for(int i =0 ;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
    }

    private static void sortWithDutchNationalFlagAlgo(ArrayList<Integer> al, int size) {

        int low_pointer = 0;
        int mid_pointer = 0;
        int high_pointer = size-1;

        while(mid_pointer<=high_pointer)
        {
            if(al.get(mid_pointer) == 0)
            {
               int temp = al.get(low_pointer);
               al.set(low_pointer , al.get(mid_pointer));
               al.set(mid_pointer,temp);

                low_pointer++;
                mid_pointer++;
            }
            else if (al.get(mid_pointer)==1)
            {
                mid_pointer++;
            }
            else if(al.get(mid_pointer)==2)
            {
                int temp = al.get(mid_pointer);
                al.set(mid_pointer , al.get(high_pointer));
                al.set(high_pointer,temp);

                high_pointer--;

                }
        }
    }

}

package arrays3;

import java.util.ArrayList;
import java.util.List;

public class printPascalTriangle
{
    public static void main(String[] args) {
        int n =5;
     List<List<Integer>> ans =   printpascal(n);
     for(List<Integer> it : ans)
     {
         System.out.print(it + " ");
     }
        System.out.println();
    }

    private static List<List<Integer>> printpascal(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int row=1;row<n;row++)
        {
            ans.add(genrateRows(row));
        }
        return ans;
    }

    private static List<Integer> genrateRows(int row) {

        List<Integer> ans = new ArrayList<>();
        long res =1 ;
        ans.add((int) 1);

        for(int col = 1;col<row;col++)
        {
            res = res * (row-col);
            res = res / col;
            ans.add((int) res);
        }
        return ans;


    }
}

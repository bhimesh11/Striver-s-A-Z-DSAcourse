import java.util.ArrayList;
import java.util.List;

public class pascalsTraingle
{
    public static void main(String[] args) {

        int n =5 ;
        List<List<Integer>> ans =    printpas(5);
        for(List<Integer> ant : ans)
        {
            System.out.print(ant + "");
        }
        System.out.println();
    }

    private static List<List<Integer>> printpas(int i) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int row = 1;row<i;row ++)
        {
            List<Integer> tempLst = new ArrayList<>();
            for(int col = 1;col<= row ;col++)
            {
                tempLst.add(genraterows(row-1,col-1));
            }
            ans.add(tempLst);
        }
        return ans;



    }

    private static Integer genraterows(int r, int c) {

        long ans =1 ;

        for(int i =0 ;i<c;i++ )
        {
            ans = ans * (r-i);
            ans = ans/ (i+1);
        }

        return (int)ans;

    }
}

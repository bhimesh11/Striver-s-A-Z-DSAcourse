package arrays2;

import java.util.ArrayList;
import java.util.List;

public class spiralTraversal {

    public static void main(String[] args) {
        int [] [] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        List<Integer> ans = printinSpiralFormat(mat);

        for(int i =0;i<ans.size();i++)
        {
            System.out.print(ans.get(i) + " ");
        }

    }

    private static List<Integer> printinSpiralFormat(int[][] mat) {

        List<Integer> ans = new ArrayList<>();
        int m = mat.length; //no of rows
        int n = mat[0].length; // no of columns

        //pointers
        int top =0 , left =0, bottom = n-1, right = m-1;

        //loop untill all elements are not traversed
        while(top<= bottom && left<= right)
        {
            //for moving left to right
            for(int i = left ;i<=right;i++)
            {
                ans.add(mat[top][i]);

            }
            top ++;

            //for moving top to bottom
            for(int i = top;i<=bottom;i++)
            {
                ans.add(mat[i][bottom]);

            }
            right--;

            // moving right to left
            if(top<= bottom)
            {
                for(int i = right;i>= left;i--)

                    ans.add(mat[bottom][i]);
                bottom--;

            }
            if(left<= right)
            {
                for(int i = bottom;i>= top;i--)
                    ans.add(mat[i][left]);
                left++;
            }
        }
        return ans;
    }
}

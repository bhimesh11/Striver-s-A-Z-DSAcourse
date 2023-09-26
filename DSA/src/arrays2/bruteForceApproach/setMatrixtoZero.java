package arrays2.bruteForceApproach;

import java.util.ArrayList;
import java.util.Arrays;

public class setMatrixtoZero {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> finalmatrix = ZeroConversion(matrix, n, m);

        for (ArrayList<Integer> row : finalmatrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    private static ArrayList<ArrayList<Integer>> ZeroConversion(ArrayList<ArrayList<Integer>> matrix, int n, int m) {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    private static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        for (int a = 0; a < n; a++) {
            if (matrix.get(a).get(j) != 0)
            {
                matrix.get(a).set(j, -1);
            }
        }
    }

    private static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {

        for (int a = 0; a < m; a++) {
            if (matrix.get(i).get(a) != 0) {
                matrix.get(i).set(a, -1);
            }
        }
    }
}

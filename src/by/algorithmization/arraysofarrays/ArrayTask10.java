package by.algorithmization.arraysofarrays;

public class ArrayTask10 {

    //Task 10
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int s = 0;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (i == j) {
                    s += a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
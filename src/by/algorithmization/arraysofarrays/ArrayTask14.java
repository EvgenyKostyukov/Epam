package by.algorithmization.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTask14 {
    public static void main(String[] args) {

        //Task14
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns equals quality of strings ");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];
            if(m == n) {
                int count;
                for (int i = 0; i < matrix.length; i++) {
                    count = i + 1;
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (count - 1 > 0) {
                            matrix[i][j] = 0;
                            count--;
                        } else {
                            matrix[i][j] = 1;
                        }
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                    System.out.println();
                }
            }else System.out.println("If you want to get correct answer please enter m = n! ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

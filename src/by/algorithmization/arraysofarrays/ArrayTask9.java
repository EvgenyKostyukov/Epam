package by.algorithmization.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTask9 {
    public static void main(String[] args) {

        //Task9
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 100);
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            int maxColumn = 1;
            int maxSum = 0;
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][j];
                }
                System.out.printf("%nThe sum elements in column is №%d: %d", j + 1, sum);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxColumn = j + 1;
                }
                sum = 0;
            }
            System.out.printf("\n\nColumn №%d consists max sum.", maxColumn);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package by.algorithmization.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTask2 {
    public static void main(String[] args) {

        //Task2
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int strings = Integer.parseInt(reader.readLine());
            System.out.println("Enter quality of columns");
            int columns = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[strings][columns];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Elements of the main diagonal:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%3d  ", matrix[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Side diagonal elements:");
            for (int i = matrix.length-1; i >= 0; i--) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i + j == matrix.length-1) {
                        System.out.printf("%3d  ", matrix[i][j]);
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

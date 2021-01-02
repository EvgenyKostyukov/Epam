package by.algorithmization.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTask1 {
    public static void main(String[] args) {

        //Task1
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size of matrix.\n Enter amount of strings");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Enter amount of columns");
            int m = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int negativePositive = Math.random() < 0.5 ? -1 : 1; //determinate negative or positive values
                    matrix[i][j] = (int) (Math.random() * 100) * negativePositive; //filling
                    System.out.print(matrix[i][j] + ",");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

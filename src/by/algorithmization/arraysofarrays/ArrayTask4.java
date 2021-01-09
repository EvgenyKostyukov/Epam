package by.algorithmization.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTask4 {
    public static void main(String[] args) {

        //Task4
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the square matrix with even number n: ");
            int n = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[n][n];
            int count = 0;
            int nDecriment = 0;
            if (n % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i % 2 == 0) {
                            count++;
                            matrix[i][j] = count;
                            System.out.printf("%3d ", matrix[i][j]);
                        } else {
                            nDecriment++;
                            matrix[i][j] = (n+1) - nDecriment;
                            System.out.printf("%3d ", matrix[i][j]);
                        }
                    }
                    count = 0;
                    nDecriment = 0;
                    System.out.println();
                }
            } else {
                System.out.println("Number n is odd!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
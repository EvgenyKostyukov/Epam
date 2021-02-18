package by.algorithmization.decompositionusingmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    private static void creationOfArray(int m, int n) {
        int[] array = new int[m];
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            System.out.printf("%d, ", array[i]);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size of array: ");
            int m = Integer.parseInt(read.readLine());
            System.out.println("Enter number N: ");
            int n = Integer.parseInt(read.readLine());
            creationOfArray(m, n);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

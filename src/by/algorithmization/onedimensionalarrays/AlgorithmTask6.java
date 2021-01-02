package by.algorithmization.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmTask6 {
    public static void main(String[] args) {

        // Task6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() / 1 * 10) - 5;
        }
        System.out.print(Arrays.toString(array) + "\n");
        double sum = 0;
        nextPrime:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue nextPrime;
                }
            }
            sum += array[i];
            System.out.println("Prime number " + i + " element of array " + array[i]);
        }
        System.out.println("sum is " + sum);
    }
}

package by.algorithmization.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmTask5 {
    public static void main(String[] args) {

        //Task 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.print(Arrays.toString(array) + "\n");
        for (int value : array) {
            if (value > array.length) {
                System.out.print(value + ",");
            }
        }
    }
}

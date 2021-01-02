package by.algorithmization.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmTask1V2 {
    public static void main(String[] args) {

        // Task1(v.2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter natural number k ");
        int k = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print(Arrays.toString(array) + "\n");
        for (int value : array) {
            if (value % k == 0) {
                sum = sum + value;
            }
        }
        System.out.print("The sum of elements that are multiples of " + k + " is " + sum);
    }
}

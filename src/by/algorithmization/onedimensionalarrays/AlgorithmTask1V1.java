package by.algorithmization.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmTask1V1 {

    public static void main(String[] args) {

        //Task1(v.1)
        int n;
        int k;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        n = in.nextInt();
        int mas[] = new int[n];
        System.out.print("Enter number - multiplicity: ");
        k = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "element of array: ");
            mas[i] = in.nextInt();
            if (mas[i] % k == 0) {
                sum = sum + mas[i];
            }
        }
        System.out.print("Sum of array elements multiples " + k + " = " + sum);
    }
}



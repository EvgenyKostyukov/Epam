package by.algorithmization.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingTask1 {
    public static void main(String[] args) {

        //Task1
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity an elements of first array: ");
            int n = Integer.parseInt(read.readLine());
            int[] firstArray = new int[n];
            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i] = (int) (Math.random() * 100) - 50;
                System.out.print(firstArray[i] + ", ");
            }
            System.out.println("\n\nEnter quantity an elements of second array: ");
            int m = Integer.parseInt(read.readLine());
            int[] secondArray = new int[m];

            for (int i = 0; i < secondArray.length; i++) {
                secondArray[i] = (int) (Math.random() * 100) - 50;
                System.out.print(secondArray[i] + ", ");
            }
            System.out.println("\n\nChoose number from first array: ");
            int k = Integer.parseInt(read.readLine());
            System.out.println("\n\nResult of joining two arrays : ");
            for (int i = 0; i < firstArray.length; i++) {
                System.out.print(firstArray[i] + ", ");
                if (k == firstArray[i]) {
                    for (int j = 0; j < secondArray.length; j++) {
                        System.out.print(secondArray[j] + ", ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

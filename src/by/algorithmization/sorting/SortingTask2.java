package by.algorithmization.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingTask2 {
    public static void main(String[] args) {

        //Task2
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity the elements of sequence: ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n + 1];
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + 3;
                System.out.print(array[i] + ", ");
            }
            System.out.println();
            int max;
            int temp;
            for (int i = 0; i < array.length; i++) {
                max = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] > array[max]) {
                        max = j;
                    }
                }
                temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

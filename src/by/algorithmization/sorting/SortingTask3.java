package by.algorithmization.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingTask3 {
    public static void main(String[] args) {

        //Task3
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity an elements of array: ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100) - 50;
                System.out.print(array[i] + ", ");
            }
            System.out.println("\n\n Bubble sort : ");
            int swap;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (array[i] < array[j]) {
                        swap = array[i];
                        array[i] = array[j];
                        array[j] = swap;
                    }
                }
            }
            for (int value : array) {
                System.out.print(value + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

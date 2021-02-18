package by.algorithmization.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingTask5 {
    public static void main(String[] args) {

        //Task5
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of the sequence. ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 100) * positiveNegative;
                System.out.print(array[i] + ", ");
            }
            System.out.println("\nResult after sorting: ");
            sortingShell(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void sortingShell(int[] array){
        int temp;
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] > array[i]) {
                temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                if (i - 1 > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }
}

package by.algorithmization.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingTask4 {
    public static void main(String[] args) {

        //Task4
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of the sequence. ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 100) * positiveNegative;
                System.out.print(array[i] + ", ");
            }
            sortingByInsert(array);
            System.out.println("\nAfter sorting: ");
            for (int value : array) {
                System.out.print(value + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sortingByInsert(int[] array) {
        int temp;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                int j = binarySearch(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }
    }

    private static int binarySearch(int[] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
}

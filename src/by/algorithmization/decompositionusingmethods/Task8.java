package by.algorithmization.decompositionusingmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of the array more then 6 elements: ");
            int m = Integer.parseInt(read.readLine());
            int[] array = new int[m];
            if (m >= 6) {
                for (int i = 0; i < array.length; i++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    array[i] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.print(array[i] + ", ");
                }
                System.out.println("\nResult after calculating: ");
                calculate(array, 1);
                calculate(array, 3);
                calculate(array, 4);
            } else {
                System.out.println("You entered less then 6 elements: ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void calculate(int[] array, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

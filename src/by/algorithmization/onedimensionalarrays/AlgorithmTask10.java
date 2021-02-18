package by.algorithmization.onedimensionalarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorithmTask10 {
    public static void main(String[] args) {

        //Task10
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the size of array");
            int n = Integer.parseInt(reader.readLine());
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                int negativePositive = Math.random() < 0.5 ? -1 : 1;//determinate negative or positive values
                array[i] = (int) (Math.random() * 100) * negativePositive; //filling
                System.out.print(array[i] + ",");
            }
            System.out.println();
            zerosChanging(array);
            System.out.println();
            arrayCompressing(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void arrayCompressing(int[] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i += 2) {
            array[counter - 1] = array[i];
            counter++;
            System.out.print(array[i] + ",");
        }
    }
    private static void zerosChanging(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0)
                array[i] = 0;
            System.out.print(array[i] + ",");
        }
    }
}

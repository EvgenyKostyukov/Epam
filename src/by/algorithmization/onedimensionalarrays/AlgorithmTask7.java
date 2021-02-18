package by.algorithmization.onedimensionalarrays;

import java.util.Scanner;

public class AlgorithmTask7 {
    public static void main(String [] args) {

        //Task7
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array N: ");
        int n = in.nextInt();
        double[] array = new double[n];
        if(array.length % 2 != 0){
            throw new IllegalArgumentException("Array size must be even!!!");
        }
        System.out.println("Fill the array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextDouble();
        }
        System.out.println("Maximum amount = " + maxSumEvenArray(array));
    }
    public static double maxSumEvenArray(double[] array){
        double maxSum = array[0] + array[array.length - 1];
        for(int i = 1; i < array.length / 2; i++){
            if((array[i] + array[array.length - i - 1]) > maxSum){
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        return maxSum;
    }
}

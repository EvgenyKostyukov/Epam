package by.algorithmization.decompositionusingmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    private static String moreDigits(int m, int n) {
        int firstCount = (int) (Math.log10(Math.abs(m)) + 1);
        int secondCount = (int) (Math.log10(Math.abs(n)) + 1);
        if (firstCount == secondCount) {
            return "The quantity of digits is equal";
        } else {
            return (firstCount > secondCount) ? ("M consists more") : ("N consists more");
        }
    }

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number M: ");
            int m = Integer.parseInt(read.readLine());
            System.out.println("Enter the number N: ");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Number that consist more digits: ");
            System.out.println(moreDigits(m, n));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

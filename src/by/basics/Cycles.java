package by.basics;

import java.io.IOException;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {

        //Task1
        System.out.print("Enter any positive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //Task2
        double a = 1;
        double b = 10;
        double h = 2;
        double x = 1;
        int i = 1;
        double F = 1;
        while (x <= b) {
            x = i * h + a;
            if (Math.cos(x) == 0) {
                System.out.println(x + " do not divide by zero!");
            } else {
                F = x / Math.cos(x);
                System.out.println(x + " " + F);
            }
        }

        //Task3
        int nTask3 = 100, sumTask3 = 0;
        for (int iTask3 = 1; iTask3 <= nTask3; iTask3++) {
            sumTask3 += Math.pow(iTask3, 2);
        }
        System.out.println(sumTask3);

        //Task4
        int nTask4 = 200, sumTask4 = 1;
        for (int iTask4 = 1; iTask4 <= nTask4; iTask4++) {
            sumTask4 *= Math.pow(iTask4, 2);
        }
        System.out.println(sumTask4);

        //Task5
        String allSymbols = "` 1234567890-=qwertyuiop[]asdfghjkl;'\\ zxcvbnm,./йцукенгшщзхъфывапролджэячсмитьбю./ *-";
        int number = 1;
        for (char symbol : allSymbols.toCharArray()) {
            String hexSymbolValue = String.format("%04x", (int) symbol);
            int octalSymbolValue = (int) symbol;
            System.out.println("Symbol: " + number + " " + symbol + " " + hexSymbolValue + " " + octalSymbolValue);
            number++;
        }

        //Task6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two natural numbers with ENTER: ");
        int number1Task6 = scanner.nextInt();
        int nTask6 = scanner.nextInt();
        int xx = number1Task6 - nTask6;
        int count = 0;
        for (int iTask6 = 1; iTask6 <= xx; iTask6++) {
            if ((xx % iTask6) == 0) {
                count++;
                System.out.print(iTask6 + " ");
            }
        }
        System.out.println();
        System.out.println("Number of dividers - " + count);

        //Task7
        int[] arr = new int[10];
        int var1Task7 = 4953;
        while (var1Task7 != 0) {
            arr[var1Task7 % 10]++;
            var1Task7 /= 10;
        }
        int var2Task7 = 590;
        while (var2Task7 != 0) {
            if (arr[var2Task7 % 10] != 0) {
                System.out.println(var2Task7 % 10);
                var2Task7 /= 10;
            }
        }
    }
}



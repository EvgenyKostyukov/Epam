package by.basics;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start line A");
        int aTask2 = scanner.nextInt();
        System.out.println("Enter finish line B");
        int bTask2 = scanner.nextInt();
        System.out.println("Enter step h");
        double hTask2 = scanner.nextDouble();
        System.out.println("Enter the value of x");
        int xTask2 = scanner.nextInt();
        int yTask2;

        for (double i = aTask2; i <= bTask2; i = i + hTask2) {
            if (xTask2 > 2) {
                yTask2 = xTask2;
            } else
                yTask2 = -xTask2;
            System.out.println("x = " + xTask2 + "\n" + "y = " + yTask2);
        }

        //Task3
        int nTask3 = 100, sumTask3 = 0;
        for (int iTask3 = 1; iTask3 <= nTask3; iTask3++) {
            sumTask3 += Math.pow(iTask3, 2);
        }
        System.out.println(sumTask3);

        //Task4
        long totalNumber=0;
        int squaredResult;
        int simpleVariable = 1;
        for (int i = 1; i <= 200; i++) {
            squaredResult = simpleVariable * (i * i);
            System.out.println("number squared = " + squaredResult);
            totalNumber = totalNumber+squaredResult;
        }
        System.out.println("Total num = " + totalNumber);


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
        System.out.println("Enter start of line numbers m ");
        int mTask6 = scanner.nextInt();
        System.out.println("Enter end of line numbers n ");
        int nTask6 = scanner.nextInt();

        while (mTask6 <= nTask6) {
            System.out.print("\n number: " + mTask6);
            System.out.print(" its dividers: ");
            for (int iTask6 = 2; iTask6 <= mTask6 - 1; iTask6++) {
                if (mTask6 % iTask6 == 0) {
                    System.out.print(iTask6 + ",");
                }
            }
            mTask6 = mTask6 + 1;
        }

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



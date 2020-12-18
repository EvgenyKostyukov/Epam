package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) throws IOException {
        //Task1 Напишите программу, где пользователь вводит любое
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //Task2 Вычислить значения функции на отрезке [а,b] c шагом h:
        double a = 0; //начало отрезка
        double b = 10; // конец отрезка
        double h = 1; //шаг
        double x = 0; //текущее значение аргумента
        int i = 0; //номер шага
        double F = 0;
        while (x <= b) {
            x = a + i * h;
            if (Math.cos(x) == 0) {
                System.out.println(x + " не делите на ноль!");
            } else {
                F = x / Math.cos(x);
                System.out.println(x + " " + F);
            }
            i++;
        }

        //Task3 Найти сумму квадратов первых ста чисел.
        int nTask3 = 100, sumTask3 = 0;
        for (int iTask3 = 1; iTask3 <= nTask3; iTask3++) {
            sumTask3 += Math.pow(iTask3, 2);
        }
        System.out.println(sumTask3);

        //Task4  Составить программу нахождения произведения квадратов первых двухсот чисел
        int nTask4 = 200, sumTask4 = 1;
        for (int iTask4 = 1; iTask4 <= nTask4; iTask4++) {
            sumTask4 *= Math.pow(iTask4, 2);
        }
        System.out.println(sumTask4);

        //Task5  Вывести на экран соответствий между символами
        int nTask5 = 255;
        for (int iTask5 = 0; iTask5 <= nTask5; iTask5++) {
            if (iTask5 % 50 == 0) {
                System.out.print("\n");
            }
            System.out.print((char) iTask5);
        }

        //Task6 Для каждого натурального числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два натуральных чиcла через ENTER: ");
        int m = scanner.nextInt();
        int nTask6 = scanner.nextInt();
        int xx = m - nTask6;
        int count = 0;
        for (int iTask6 = 1; iTask6 <= xx; iTask6++) {
            if ((xx % iTask6) == 0) {
                count++;
                System.out.print(iTask6 + " ");
            }
        }
        System.out.println();
        System.out.println("Количество делителей - " + count);

        //Task6 Даны два числа. Определить цифры, входящие в запись
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число : ");
        String userIn1 = read.readLine();
        System.out.println("Введите второе число : ");
        String userIn2 = read.readLine();
        int length1 = userIn1.length();
        int length2 = userIn2.length();
        System.out.println("Первое число: ");
        for (int iTask6 = 0; iTask6 < length1; iTask6++) {
            int xTask6 = Integer.parseInt(userIn1.substring(iTask6, (iTask6 + 1)));
            System.out.println(xTask6);
        }
        System.out.println("Второе число: ");
        for (int iTask66 = 0; iTask66 < length2; iTask66++) {
            int xTask66 = Integer.parseInt(userIn2.substring(iTask66, (iTask66 + 1)));
            System.out.println(xTask66);
        }
    }
}



package Basics;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {

        //Task1 даны 2 угла треугольника
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два угла в градусах: ");
        int a111 = scanner.nextInt();
        int b111 = scanner.nextInt();
        if (a111 + b111 == 180) {
            System.out.println("Треугольник существует!");
        } else if (a111 == 90 || b111 == 90 || a111 + b111 == 90) {
            System.out.println("Треугольникк прямоуголный!");
        } else System.out.println("Треугольник не существет!");

        //Task2 Найти max{min(a1111, b1111), min(c, d)}.
        int a1, b1, c1, d1;
        System.out.println("Введите четыре натуральных числа через ENTER: ");
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        c1 = scanner.nextInt();
        d1 = scanner.nextInt();
        int minab = Math.min(a1, b1);
        int mincb = Math.min(c1, d1);
        int maxNumber = Math.max(minab, mincb);
        System.out.println("Максимальное число из минимальных: " + maxNumber);

        //Task3 Даны три точки
        int x1, y1, x2, y2, x3, y3;
        System.out.println("Введите координаты трех точек через ENTER (шесть чисел) х и у: ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки расположены на одной прямой!");
        } else System.out.println("Точки НЕ расположены на одной прямой!");

        //Task4 Заданы размеры А, В прямоугольного отверстия.
        int a1111, b1111, x111, y111, z111;
        System.out.println("Введите размеры А, В прямоугольного отверстия: ");
        a1111 = scanner.nextInt();
        b1111 = scanner.nextInt();
        System.out.println("Введите размеры х, у, z кирпича: ");
        x111 = scanner.nextInt();
        y111 = scanner.nextInt();
        z111 = scanner.nextInt();
        if (((a1111 >= x111) && (b1111 >= y111)) || ((a1111 >= y111) && (b1111 >= x111))
                || ((a1111 >= x111) && (b1111 >= z111)) || ((a1111 >= z111) && (b1111 >= x111))
                || (((a1111 >= z111) && (b1111 >= y111)) || ((a1111 >= y111) && (b1111 >= z111)))) {
            System.out.println("кирпич влезет в отверстие!");
        } else System.out.println("кирпич НЕ влезет в отверстие!");

        //Task5 Вычислить значение функции
        System.out.println("Введите значение х через ENTER: ");
        double xTask5 = scanner.nextDouble();
        if (xTask5 <= 3) {
            double result = Math.pow(xTask5, 2) - (3 * xTask5) + 9;
            System.out.println(result);
        } else System.out.println((1 / (Math.pow(xTask5, 3) + 6)));
    }
}

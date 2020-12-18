package Basics;

import java.util.Scanner;

public class LinearPrograms {
    public static void main(String[] args) {

        //Task 1   Найдите  значение функции
        int a = 2, b = 3, c = 4;
        System.out.println(((a - 3) * b / 2) + c);

        //Task 2   Вычислить значение выражения по формуле
        double a2 = 2.5, b2 = 3.5, c2 = 4.5;
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        n1 = Math.pow(b2, 2);
        n2 = 4 * a2 * c2;
        n3 = n1 + n2;
        n4 = Math.sqrt(n3);
        n5 = b2 + n4;
        n6 = 2 * a2;
        n7 = n5 / n6;
        n8 = Math.pow(a2, 3);
        n9 = n8 * c2;
        n10 = Math.pow(b2, -2);
        System.out.println("Result function: " + (n7 - n9 + n10));

        //Task3 Вычислить значение выражения по формуле
        double x = 3.5, y = 4.5;
        double q1, q2, q3, q4, q5, q6, q7, q8, q9;
        q1 = Math.sin(x);
        q2 = Math.cos(y);
        q3 = q1 + q2;
        q4 = Math.cos(x);
        q5 = Math.sin(y);
        q6 = q4 - q5;
        q7 = q3 / q6;
        q8 = x * y;
        q9 = Math.tan(q8);
        System.out.println("Result function: " + (q7 * q9));

        //Task4 Дано действительное число R
        double R = 987.456;
        double result = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println(result);

        //Task5 Дано натуральное число Т
        int T = 7330;
        int HH, MM, SS;
        System.out.println("Всего секунд: " + T);
        HH = T / 3600;
        MM = (T % 3600) / 60;
        SS = T % 60;
        System.out.println(HH + "ч. " + MM + "мин. " + SS + "с.");

        //Task6 Для данной области составить линейную программу
        Scanner scanner = new Scanner(System.in);
        int xx, yy;
        System.out.println("Введите координаты точки х и у через ENTER:  ");
        xx = scanner.nextInt();
        yy = scanner.nextInt();
        if (yy < 4 && yy > -3 || xx < 4 && xx > -4) {
            System.out.println("true");
        } else System.out.println("false");
    }
}

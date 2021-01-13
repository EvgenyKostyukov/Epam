package by.basics;

import java.util.Scanner;

public class LinearPrograms {
    public static void main(String[] args) {

        //Task 1
        int a = 2, b = 3, c = 4;
        System.out.println(((a - 3) * b / 2) + c);

        //Task 2
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

        //Task3
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

        //Task4
        double R = 987.456;
        double result = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println(result);

        //Task5
        int T = 7330;
        int HH, MM, SS;
        System.out.println("Only seconds: " + T);
        HH = T / 3600;
        MM = (T % 3600) / 60;
        SS = T % 60;
        System.out.println(HH + "HH. " + MM + "MM. " + SS + "SS.");

        //Task6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int coordinateX = scanner.nextInt();
        System.out.println("Enter y");
        int coordinateY = scanner.nextInt();
        if (-4 <= coordinateX && coordinateX <= 4 && -3 <= coordinateY && coordinateY <= 0 ){
            System.out.println("The point into shape");
        }
        else if (-2 <=coordinateX && coordinateX <= 2 && 0 <= coordinateY && coordinateY <= 4  ){
            System.out.println("The point into shape");
        } else
            System.out.println("The point outer the shape");
    }
}

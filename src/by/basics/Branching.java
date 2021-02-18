package by.basics;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {

        //Task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three angles in degrees through ENTER: ");
        int inFirstVariable = scanner.nextInt();
        int inSecondVariable = scanner.nextInt();
        int inThirdVariable = scanner.nextInt();
        if (inFirstVariable + inSecondVariable + inThirdVariable == 180) {
            System.out.println("The triangle exists!");
        } else if (inFirstVariable == 90 || inSecondVariable == 90 || inThirdVariable == 90) {
            System.out.println("The triangle is rectangular!");
        } else {
            System.out.println("The triangle does not exist!");
        }

        //Task2
        System.out.println("Enter four natural numbers using ENTER: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int minNumber1AndNumber2 = Math.min(number1, number2);
        int minNumber3AndNumber4 = Math.min(number3, number4);
        int maxNumber = Math.max(minNumber1AndNumber2, minNumber3AndNumber4);
        System.out.println("Maximum from minimum: " + maxNumber);

        //Task3
        System.out.println("Enter the coordinates of the three points with ENTER (six numbers) x and y: ");
        int x1Task3 = scanner.nextInt();
        int y1Task3 = scanner.nextInt();
        int x2Task3 = scanner.nextInt();
        int y2Task3 = scanner.nextInt();
        int x3Task3 = scanner.nextInt();
        int y3Task3 = scanner.nextInt();
        if ((x1Task3-x2Task3)*(y1Task3-y3Task3)==(x1Task3-x3Task3)*(y1Task3-y2Task3)) {
            System.out.println("The points are located on one straight line!");
        } else System.out.println("The points are NOT on the same straight line!");

        //Task4
        System.out.println("Enter dimensions A, B of rectangular hole: ");
        int var1Task4 = scanner.nextInt();
        int var2Task4 = scanner.nextInt();
        System.out.println("Enter the dimensions x, y, z of the brick: ");
        int var3Task4 = scanner.nextInt();
        int var4Task4 = scanner.nextInt();
        int var5Task4 = scanner.nextInt();
        if (((var1Task4 >= var3Task4) && (var2Task4 >= var4Task4))
                || ((var1Task4 >= var4Task4) && (var2Task4 >= var3Task4))
                || ((var1Task4 >= var3Task4) && (var2Task4 >= var5Task4))
                || ((var1Task4 >= var5Task4) && (var2Task4 >= var3Task4))
                || (((var1Task4 >= var5Task4) && (var2Task4 >= var4Task4))
                || ((var1Task4 >= var4Task4) && (var2Task4 >= var5Task4)))) {
            System.out.println("the brick will fit into the hole!");
        } else {
            System.out.println("the brick will NOT fit into the hole!");
        }

        //Task5
        System.out.println(" Enter x ");
        double xTask5 = scanner.nextDouble();
        double gTask5, zTask5;
        if (xTask5 <= 3) {
            zTask5 = Math.pow(xTask5, 2) - 3 * xTask5 + 9;
            System.out.printf("Result 1: %.1f ", zTask5);
        } else if (xTask5 > 3) {
            gTask5 = 1 / (Math.pow(xTask5, 3) + 6);
            System.out.printf("Result 2: %.1f ", gTask5);
        }
    }
}

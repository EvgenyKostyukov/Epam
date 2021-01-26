package by.programming_with_classes.the_simplest_classes.task7;

import java.util.Locale;

public class Triangle {
    private Side A;
    private Side B;
    private Side C;

    private Triangle(Side a, Side b, Side c) {
        A = a;
        B = b;
        C = c;
    }

    private static Triangle createTriangle(Point a, Point b, Point c) {
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(a, c);
        return new Triangle(A, B, C);
    }

    private double calculatePerimeter() {
        return A.calculateSide() + B.calculateSide() + C.calculateSide();
    }

    private double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - A.calculateSide()) * (p - B.calculateSide()) * (p - C.calculateSide()));
    }

    private Point pointMedianIntersection() {
        double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
        double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
        return new Point(x, y);
    }


    public static void main(String[] args) {
        Point a = new Point(-1, -6);
        Point b = new Point(4, 9);
        Point c = new Point(5, 3);
        System.out.printf(Locale.US, "the triangle vertices are set: a(%.1f,%.1f); b(%.1f,%.1f); c(%.1f,%.1f).%n",
                a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());

        Triangle triangle = createTriangle(a, b, c);

        double perimeter = triangle.calculatePerimeter();
        System.out.printf(Locale.US, "perimeter of the triangle: %f.%n", perimeter);

        double area = triangle.calculateArea();
        System.out.printf(Locale.US, "area of a triangle: %f.%n", area);

        Point o = triangle.pointMedianIntersection();
        System.out.printf(Locale.US, "median intersection point: o(%f,%f).", o.getX(), o.getY());
    }
}
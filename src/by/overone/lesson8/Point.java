package by.overone.lesson8;

import java.util.Scanner;

import static java.lang.Math.*;

public class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        distance();
    }
    public static void distance() {
        Point point = new Point();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x coordinate of your point: ");
        while (!sc.hasNextDouble())
            sc.next();
        double point1 = sc.nextDouble();
        System.out.print("Input y coordinate of your point: ");
        while (!sc.hasNextDouble())
            sc.next();
        double point2 = sc.nextDouble();
        point.setX(3);
        point.setY(4.5);
        double arg1 = point.getX();
        double arg2 = point.getY();
        System.out.print(sqrt((pow(abs(point1 - arg1), 2)) + (pow(abs(point2 - arg2), 2))));
    }
}

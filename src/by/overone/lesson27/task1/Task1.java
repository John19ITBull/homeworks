package by.overone.lesson27.task1;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args) {
        IShape circle = (parameter) -> (PI * pow(parameter[0], 2));
        IShape triangle = (parameter) -> ((parameter[0] * parameter[1]) / 2);
        IShape rectangle = (parameter) -> (parameter[0] * parameter[1]);
        double result1 = circle.getSquare(4);
        double result2 = triangle.getSquare(3.5, 4);
        double result3 = rectangle.getSquare(1, 2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

interface IShape {
    double getSquare(double... parameter);
}

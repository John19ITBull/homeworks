package by.overone.lesson27.task2;


public class Task2 {
    public static void main(String[] args) {
        ILogic logic = (a, b) -> {
            double res = a > b ? b : (a < b ? a : 0);
            return res;
        };
        double result = logic.getNumber(3, 6);
        System.out.println(result);
    }
}

interface ILogic {
    double getNumber(double a, double b);
}
package by.overone.lesson1;

public class Task1 {
    public static void main(String[] args) {
        int a = 28;
        short b = 19;
        int result1 = a + b; //можно исп. long для больших чисел, но я выбрал int
        System.out.println(result1);
        long c = 390;
        double d = 34.5;
        double result2 = c - d;
        System.out.printf("%.1f", result2);
        System.out.println();
        float e = 97.1f;
        double f = 186.2;
        double result3 = e * f;
        System.out.print(result3);
    }
}

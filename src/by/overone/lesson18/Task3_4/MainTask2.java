package by.overone.lesson18.Task3_4;

public class MainTask2 {
    public static void main(String[] args) {
        ClassForGenerics<Double> number1 = new ClassForGenerics(16.45);
        ClassForGenerics<Double> number2 = new ClassForGenerics(23.5);
        Solution solution = new Solution(number1, number2);

        ClassForGenerics result1 = solution.sum();
        System.out.println("Result of addition: ");
        result1.printValue();

        ClassForGenerics result2 = solution.deduct();
        System.out.println("Result of subtraction: ");
        result2.printValue();

        ClassForGenerics result3 = solution.multiply();
        System.out.println("Result of multiply: ");
        result3.printValue();

        ClassForGenerics result4 = solution.division();
        System.out.println("Result of division: ");
        result4.printValue();
    }
}

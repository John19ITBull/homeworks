package by.overone.lesson18.Task3_4;

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
    T number1;
    T number2;

    public Solution(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1() {
        return number1;
    }

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public T getNumber2() {
        return number2;
    }

    public void setNumber2(T number2) {
        this.number2 = number2;
    }

    public ClassForGenerics sum() {
        return new ClassForGenerics(number1.getNumber().doubleValue() + number2.getNumber().doubleValue());
    }

    public ClassForGenerics deduct() {
        return new ClassForGenerics(number1.getNumber().doubleValue() - number2.getNumber().doubleValue());
    }

    public ClassForGenerics multiply() {
        return new ClassForGenerics(number1.getNumber().doubleValue() * number2.getNumber().doubleValue());
    }

    public ClassForGenerics division() {
        return new ClassForGenerics(number1.getNumber().doubleValue() / number2.getNumber().doubleValue());
    }
}

package by.overone.lesson18.Task3_4;

public class ClassForGenerics <K extends Number> implements InterfaceForGenerics  {
    K number;

    public ClassForGenerics(K number) {
        this.number = number;
    }

    public K getNumber() {
        return number;
    }

    public void setNumber(K number) {
        this.number = number;
    }

    @Override
    public void printValue() {
        System.out.println(number.doubleValue());
    }
}

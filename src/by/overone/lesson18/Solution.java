package by.overone.lesson18;

public class Solution<T extends ClassForGenerics & InterfaceForGenerics>  {
    public T number1;
    public T number2;

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

//    public T sum(T a, T b){
//        if(T == Integer)
//        return ((Object)a + (Object)b);
//    }
}

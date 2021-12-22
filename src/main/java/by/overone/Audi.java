package by.overone;

public class Audi implements Sound {

    public Audi() {
        System.out.println("Audi is ready");
    }

    @Override
    public void sound() {
        System.out.println("Wruuuu-wru-wru-wru-wru");
    }
}

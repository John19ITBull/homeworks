package by.overone;

public class Tesla implements Sound {

    public Tesla() {
        System.out.println("Tesla is ready");
    }

    @Override
    public void sound() {
        System.out.println("---");
    }
}

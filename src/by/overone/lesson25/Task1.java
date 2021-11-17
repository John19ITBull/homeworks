package by.overone.lesson25;

public class Task1 {

    public static void main(String[] args) {
        Integer value = null;
        try {
            value.toString();
        } catch (NullPointerException ex) {
            System.out.println("Error");
        }
    }
}

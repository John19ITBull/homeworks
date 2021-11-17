package by.overone.lesson25;

import java.util.Arrays;

public class Task3 extends Exception {

    public static void exception() throws Task3 {
        throw new Task3();
    }

    public static void main(String[] args) {
        try {
            Task3.exception();
        } catch (Exception ex) {
            System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        }
    }
}

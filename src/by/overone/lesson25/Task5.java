package by.overone.lesson25;

import java.util.Arrays;

public class Task5 extends Exception {
    public Task5(String str) {
        System.out.println(str);
    }

    public static void nullException() throws Task5 {
        throw new Task5("My own exception, because instead of NullPointerException");
    }

    public static void main(String[] args) throws Task5 {
        Integer value = null;
        try {
            value.toString();
        } catch (NullPointerException ex) {
            Task5.nullException();
        }
    }
}

package by.overone.lesson25;

import java.util.Arrays;

public class Task4 extends RuntimeException {

    public Task4(String str) {
        System.out.println(str);
    }

    public static void exception() {
        throw new Task4("Error");
    }

    public static void main(String[] args) {
        try {
            Task4.exception();
        } catch (Exception ex) {
            System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        }
    }
}
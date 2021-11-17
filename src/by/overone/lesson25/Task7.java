package by.overone.lesson25;

import java.util.Random;

public class Task7 {
    public static void exception() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    public static void main(String[] args) {
        try {
            Random random = new Random();
            int rand = random.nextInt(2);
            if (rand == 0) {
                Task7.exception();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException was catched");
        } finally {
            System.out.println("Finally block");
        }
    }
}

package by.overone.lesson25;

import java.util.Random;

public class Task6 {
    public static void exception() {
        Random rand = new Random();
        int random = rand.nextInt(3);
        if (random == 0) {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }
        if (random == 1) {
            Integer value = null;
            value.toString();
        }
        if (random == 2) {
            int num1 = 1;
            int num2 = 0;
            System.out.println(num1 / num2);
        }
    }

    public static void main(String[] args) {
        try {
            Task6.exception();
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
    }
}

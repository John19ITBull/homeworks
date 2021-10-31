package by.overone.lesson4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int array[] = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
            System.out.print(array[i] + " ");
        }
        if (array[2] > array[1] && array[1] > array[0]) {
            System.out.print("\n" + "Strictly increasing sequence");
        } else {
            System.out.print("\n" + "Not strictly increasing sequence");
        }
    }
}

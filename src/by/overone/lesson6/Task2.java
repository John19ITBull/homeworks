package by.overone.lesson6;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int honest = 0;
        Random random = new Random();
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                honest += 1;
            }
        }
        System.out.print("\nHonest values: " + honest);
    }
}
